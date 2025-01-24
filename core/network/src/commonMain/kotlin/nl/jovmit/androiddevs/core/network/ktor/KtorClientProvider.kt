package nl.jovmit.androiddevs.core.network.ktor

import io.ktor.client.HttpClient

interface KtorClientProvider {
    val ktorClientImp: HttpClient
}
