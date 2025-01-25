package nl.jovmit.androiddevs.core.view.validation


class EmailValidator {

    private val emailPattern = Regex(EMAIL_REGEX)

    fun validateEmail(email: String): Boolean {
        return emailPattern.matches(email)
    }

    companion object {
        private const val EMAIL_REGEX = """[a-zA-Z0-9+._%\-]{1,64}@[a-zA-Z0-9][a-zA-Z0-9\-]{1,64}(\.[a-zA-Z0-9][a-zA-Z0-9\-]{1,25})"""
    }
}
