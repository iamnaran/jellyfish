package ui.auth

data class LoginState(
    val email: String = "kminchelle",
    val password: String = "0lelplR",
    val isLoginSuccessful: Boolean = false,
    val isLoading: Boolean = false
)
