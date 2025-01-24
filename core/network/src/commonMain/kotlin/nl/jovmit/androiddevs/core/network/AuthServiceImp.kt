package nl.jovmit.androiddevs.core.network

import io.ktor.client.call.body
import io.ktor.http.HttpMethod
import io.ktor.http.HttpStatusCode
import kotlinx.serialization.json.Json
import nl.jovmit.androiddevs.core.network.ktor.Ktor

class AuthServiceImp(private val ktor: Ktor) : AuthService {

    override suspend fun login(loginData: LoginData): AuthResponse {
        val response = ktor.makeOAuthRequest(method = HttpMethod.Post, url = "/auth/login")
        when (response.status) {
            HttpStatusCode.OK -> {
                val responseBody: String = response.body()
                val parsedData: AuthResponse =
                    Json.decodeFromString(AuthResponse.serializer(), responseBody)
                return parsedData
            }

            else -> throw Exception("Error")
        }
    }

    override suspend fun signUp(signUpData: SignUpData): AuthResponse {
        return AuthResponse("token", AuthResponse.UserData("id", "email", "about"))
    }
}
