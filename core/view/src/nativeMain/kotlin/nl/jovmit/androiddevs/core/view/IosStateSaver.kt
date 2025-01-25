package nl.jovmit.androiddevs.core.view

import platform.Foundation.NSUserDefaults

class IosStateSaver : StateSaver<Any> {
    private val userDefaults = NSUserDefaults.standardUserDefaults

    override fun saveState(key: String, value: Any) {
        userDefaults.setObject(value, key)
    }

    override fun getState(key: String): Any? {
        return userDefaults.stringForKey(key)
    }
}
