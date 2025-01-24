package nl.jovmit.androiddevs.core.network

interface AuthService {

    suspend fun signUp(signUpData: SignUpData): AuthResponse

    suspend fun login(loginData: LoginData): AuthResponse
}
