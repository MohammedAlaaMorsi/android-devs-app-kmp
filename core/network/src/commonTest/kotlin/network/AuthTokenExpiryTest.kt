package network

import com.google.common.truth.Truth.assertThat
import nl.jovmit.androiddevs.core.network.ExpiredTokenInterceptor
import nl.jovmit.androiddevs.core.network.LogoutSignal
import org.junit.jupiter.api.Test

class AuthTokenExpiryTest {

    private val logoutSignal = LogoutSignal()

    @Test
    fun callResponseWith401() {
        val request = StubRequest(401)
        val interceptor = ExpiredTokenInterceptor(logoutSignal)

        interceptor.intercept(request)

        assertThat(logoutSignal.forcedLogout.value).isEqualTo(Unit)
    }

    @Test
    fun callResponseWith200() {
        val request = StubRequest(200)
        val interceptor = ExpiredTokenInterceptor(logoutSignal)

        interceptor.intercept(request)

        assertThat(logoutSignal.forcedLogout.value).isNull()
    }
}
