package nl.jovmit.androiddevs.core.network.ktor

import io.ktor.client.HttpClient
import nl.jovmit.androiddevs.core.platform.KtorClient

class KtorClientProviderImp : KtorClientProvider {
    override val ktorClientImp: HttpClient
        get() = KtorClient

}
