package nl.jovmit.androiddevs.core.platform

import io.ktor.client.HttpClient

//for the using platform-specific APIs
expect val KtorClient: HttpClient
