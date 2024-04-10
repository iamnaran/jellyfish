package ui.auth

sealed class LoginUIEvent {
    data class EmailChanged(val inputEmailValue: String) : LoginUIEvent()
    data class PasswordChanged(val inputPasswordValue: String) : LoginUIEvent()
    object OnSubmit : LoginUIEvent()
}