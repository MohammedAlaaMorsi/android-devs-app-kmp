package nl.jovmit.androiddevs.core.view

interface StateSaver<T> {
    fun saveState(key: String, value: T)
    fun getState(key: String): T?
}
