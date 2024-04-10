package ui.auth

import domain.PostServerLoginUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import moe.tlaster.precompose.viewmodel.ViewModel
import moe.tlaster.precompose.viewmodel.viewModelScope
import utils.ApiResponse
import utils.AppLog

public class LoginViewModel(private val postServerLoginUseCase: PostServerLoginUseCase) :
    ViewModel() {

    private val _loginState = MutableStateFlow(LoginState())
    val loginState = _loginState.asStateFlow()


    fun handleLoginUIEvent(loginUiEvents: LoginUIEvent) {

        when (loginUiEvents) {

            is LoginUIEvent.EmailChanged -> {
                _loginState.value = loginState.value.copy(
                    password = loginUiEvents.inputEmailValue
                )
            }

            is LoginUIEvent.PasswordChanged -> {

                _loginState.value = _loginState.value.copy(
                    password = loginUiEvents.inputPasswordValue
                )

            }

            is LoginUIEvent.OnSubmit -> {
                doLoginWork()
            }

            else -> {
            }
        }
    }

    fun doLoginWork() {

        viewModelScope.launch {

            postServerLoginUseCase(
                _loginState.value.email,
                _loginState.value.password
            ).collectLatest { apiResponse ->
                when (apiResponse) {
                    is ApiResponse.Success -> {
                        AppLog.showLog("----------LOGIN SUCCESS----------")

                        _loginState.value = _loginState.value.copy(
                            isLoginSuccessful = true,
                            isLoading = false
                        )

                    }

                    is ApiResponse.Loading -> {
                        _loginState.value = _loginState.value.copy(
                            isLoading = true
                        )
                    }

                    else -> {
                        _loginState.value = _loginState.value.copy(
                            isLoginSuccessful = false,
                            isLoading = false
                        )

                    }
                }


            }
        }
    }

}