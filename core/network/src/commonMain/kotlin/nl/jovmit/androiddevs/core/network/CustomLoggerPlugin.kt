package nl.jovmit.androiddevs.core.network

import co.touchlab.kermit.Logger
import io.ktor.client.plugins.api.createClientPlugin
import io.ktor.client.statement.request

val CustomLoggerPlugin = createClientPlugin("CustomLoggerPlugin") {
    onRequest { request, content ->
        Logger.d("LoggerPlugin") { "=============REQUEST==============" }
        Logger.d("LoggerPlugin") { "${request.method.value} => ${request.url}" }
        Logger.d("LoggerPlugin") { "BODY => ${request.body}" }
        Logger.d("LoggerPlugin") { "=============END-REQUEST==============" }
    }

    onResponse { response ->
        Logger.d("LoggerPlugin") { "=============RESPONSE==============" }
        Logger.d("LoggerPlugin") { "${response.request.method.value} / ${response.status} => ${response.request.url}" }
        Logger.d("LoggerPlugin") { "BODY => ${response}" }
        Logger.d("LoggerPlugin") { "=============END-RESPONSE==============" }
    }
}
