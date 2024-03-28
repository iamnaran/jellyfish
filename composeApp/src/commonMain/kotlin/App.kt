import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import di.appModules
import jellyfish.composeapp.generated.resources.Res
import moe.tlaster.precompose.PreComposeApp
import moe.tlaster.precompose.navigation.NavHost
import moe.tlaster.precompose.navigation.rememberNavigator
import moe.tlaster.precompose.navigation.transition.NavTransition
import navigation.AppScreen
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.KoinApplication
import ui.auth.LoginScreen


@Composable
@Preview
fun App() {
    KoinApplication(application = {
        modules(appModules)
    }) {
        PreComposeApp {
            MaterialTheme {
                RootNavHost()
            }
        }
    }
}

@Composable
fun RootNavHost() {
    val navigator = rememberNavigator()
    NavHost(
        navigator = navigator,
        navTransition = NavTransition(),
        initialRoute = AppScreen.Auth.Login.route,
    ) {
        scene(
            route = AppScreen.Auth.Login.route,
            navTransition = NavTransition(),
        ) {
            LoginScreen(navigateToHome = {

            }, navigateToSignUp = {

            })

        }
    }


}
