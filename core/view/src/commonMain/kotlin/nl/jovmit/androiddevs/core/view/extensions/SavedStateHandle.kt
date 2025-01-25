package nl.jovmit.androiddevs.core.view.extensions

import nl.jovmit.androiddevs.core.view.StateSaver


inline fun <T> StateSaver<T>.update(
    key: String,
    block: (T) -> T
) {
    requireNotNull(getState(key)).let(block).also { saveState(key, it) }
}
