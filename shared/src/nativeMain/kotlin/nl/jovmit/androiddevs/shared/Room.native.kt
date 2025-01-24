package nl.jovmit.androiddevs.shared

import androidx.room.Room
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import nl.jovmit.androiddevs.core.database.AppDatabase
import org.koin.core.module.Module
import org.koin.dsl.module
import platform.Foundation.NSHomeDirectory

actual fun roomModule(): Module {
    return module {
        single<AppDatabase> { getDatabaseBuilder() }
    }
}

fun getDatabaseBuilder(): AppDatabase {
    val dbFile = "${NSHomeDirectory()}/android_devs.db"

    return Room.databaseBuilder<AppDatabase>(
        name = dbFile,
    ).setQueryCoroutineContext(Dispatchers.IO)
        .build()
}
