package nl.jovmit.androiddevs.shared

import android.content.Context
import androidx.room.Room
import kotlinx.coroutines.Dispatchers
import nl.jovmit.androiddevs.core.database.AppDatabase
import org.koin.core.module.Module
import org.koin.dsl.module


actual fun roomModule(): Module {
    return module {
        single<AppDatabase> { getDatabaseBuilder(get()) }
    }
}

fun getDatabaseBuilder(context: Context): AppDatabase {
    val dbFile = context.getDatabasePath("android_devs.db")
    return Room.databaseBuilder<AppDatabase>(context, dbFile.absolutePath)
        .setQueryCoroutineContext(Dispatchers.IO)
        .build()
}
