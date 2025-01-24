package nl.jovmit.androiddevs

import android.app.Application
import nl.jovmit.androiddevs.shared.initKoin
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger

class AndroidDevsApp : Application() {

    override fun onCreate() {
        super.onCreate()
        // Initialize koin
        initKoin {
            androidLogger()
            androidContext(this@AndroidDevsApp)
        }

    }
}
