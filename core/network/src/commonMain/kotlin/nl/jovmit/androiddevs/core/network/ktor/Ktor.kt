package nl.jovmit.androiddevs.core.network.ktor

import io.ktor.client.HttpClient
import io.ktor.client.request.header
import io.ktor.client.request.parameter
import io.ktor.client.request.request
import io.ktor.http.HttpHeaders
import io.ktor.http.HttpMethod
import kotlinx.coroutines.runBlocking

class Ktor(private val client: HttpClient) {

    fun makeOAuthRequest(
        method: HttpMethod,
        url: String,
        params: Map<String, String> = emptyMap()
    ) = runBlocking {
        client.request(url) {
            this.method = method
            header(HttpHeaders.Authorization, "OAuth")
            params.forEach { (key, value) ->
                parameter(key, value)
            }
        }
    }
}
