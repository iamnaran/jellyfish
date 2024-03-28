package ui.auth

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusManager
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.unit.dp
import ui.appcomponents.AppCircularProgressBar
import ui.appcomponents.AppIcons
import ui.appcomponents.EmailInput
import ui.appcomponents.PasswordInput

@Composable
fun LoginScreen(
//    viewModel: LoginViewModel = koinViewModel(),
    navigateToHome: () -> Unit,
    navigateToSignUp: () -> Unit,
) {

    Column(modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center
        ){
        Text("Login")
    }

}


@Composable
fun LoginContent(
    email: String,
    password: String,
    onEmailChange: (String) -> Unit,
    onPasswordChange: (String) -> Unit,
    onLoginClick: () -> Unit,
    onSignUpClick: () -> Unit,
    isLoginProgress: Boolean
) {
//    val passwordFocusRequester = FocusRequester()
//    val focusManager: FocusManager = LocalFocusManager.current
//
//    Column(
//        Modifier
//            .padding(8.dp)
//            .fillMaxSize()
//            .verticalScroll(rememberScrollState()),
//        verticalArrangement = Arrangement.SpaceEvenly,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//
//        Box(
//            modifier = Modifier
//                .weight(2f)
//                .padding(8.dp), contentAlignment = Alignment.Center
//        ) {
////            Image(
////                painter = painterResource(id = R.drawable.ic_app_logo),
////                contentDescription = "logo",
////                Modifier.padding(10.dp)
////            )
//        }
//
//        Box(
//            modifier = Modifier.weight(3f),
//        ) {
//            Spacer(modifier = Modifier.height(20.dp))
//
//            Column(verticalArrangement = Arrangement.Center) {
//                EmailInput(
//                    currentValue = email,
//                    keyboardActions = KeyboardActions(onNext = { passwordFocusRequester.requestFocus() }),
//                    onValueChange = onEmailChange,
//                    icon = AppIcons.Email,
//                    label = stringResource(id = R.string.label_email),
//                )
//
//                Spacer(modifier = Modifier.height(20.dp))
//
//                PasswordInput(
//                    currentValue = password,
//                    keyboardActions = KeyboardActions(onDone = { focusManager.clearFocus() }),
//                    focusRequester = passwordFocusRequester,
//                    onValueChange = onPasswordChange,
//                    icon = AppIcons.Password,
//                    label = stringResource(id = R.string.label_password),
//                )
//
//                Spacer(modifier = Modifier.height(30.dp))
//
//                Button(
//                    onClick = {
//                        onLoginClick()
//                    },
//                    Modifier
//                        .fillMaxWidth()
//                ) {
//                    Box {
//                        if (isLoginProgress) {
//                            AppCircularProgressBar()
//                        } else {
//                            Text(text = "Sign In", Modifier.padding(8.dp))
//
//                        }
//
//
//                    }
//                }
//            }
//        }
//
//        Box(
//            modifier = Modifier.weight(0.5f)
//        ) {
//
//            Column(
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally
//            ) {
//                Row(verticalAlignment = Alignment.CenterVertically) {
//                    Text(text = "Don't have an account?", color = Color.Black)
//                    TextButton(onClick = {
//
//                        onSignUpClick()
//
//                    }) {
//                        Text(text = "Sign Up")
//                    }
//
//                }
//            }
//
//        }


//    }


}