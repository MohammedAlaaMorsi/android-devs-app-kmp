package nl.jovmit.androiddevs.core.view

import androidx.lifecycle.SavedStateHandle

class AndroidStateSaver(private val savedStateHandle: SavedStateHandle) : StateSaver<Any> {
    override fun saveState(key: String, value: Any) {
        savedStateHandle[key] = value
    }

    override fun getState(key: String): Any? {
        return savedStateHandle[key]
    }
}
