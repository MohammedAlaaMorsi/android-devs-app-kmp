package nl.jovmit.androiddevs.core.platform

import io.ktor.client.HttpClient
import io.ktor.client.engine.okhttp.OkHttp
import io.ktor.client.plugins.HttpTimeout
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.plugins.logging.DEFAULT
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.request.header
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import nl.jovmit.androiddevs.core.network.BuildKonfig
import nl.jovmit.androiddevs.core.network.CustomLoggerPlugin

actual val KtorClient: HttpClient
    get() = HttpClient(OkHttp) {
        //Timeout plugin to set up timeout milliseconds for client
        install(HttpTimeout) {
            socketTimeoutMillis = 60_000
            requestTimeoutMillis = 60_000
        }
        install(CustomLoggerPlugin)
        //Logging plugin combined with kermit(KMP Logger library)
        install(Logging) {
            logger = Logger.DEFAULT
            level = LogLevel.ALL
            logger = object : Logger {
                override fun log(message: String) {
                    co.touchlab.kermit.Logger.d("KtorClient") { message }
                }
            }
        }
        //We can configure the BASE_URL and also
        //the deafult headers by defaultRequest builder
        defaultRequest {
            header("Content-Type", "application/json")
            header("Authorization", "Bearer ${BuildKonfig.API_KEY}")
            url("https://api.openai.com/v1/")
        }
        //ContentNegotiation plugin for negotiationing media types between the client and server
        install(ContentNegotiation) {
            json(Json {
                prettyPrint = true
                isLenient = true
                ignoreUnknownKeys = true
                explicitNulls = false
            })
        }
    }
