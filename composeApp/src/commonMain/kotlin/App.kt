import androidx.compose.runtime.Composable
import di.appModules
import io.github.aakira.napier.DebugAntilog
import io.github.aakira.napier.Napier
import moe.tlaster.precompose.PreComposeApp
import moe.tlaster.precompose.navigation.NavHost
import moe.tlaster.precompose.navigation.rememberNavigator
import moe.tlaster.precompose.navigation.transition.NavTransition
import navigation.AppScreen
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.KoinApplication
import themes.JellyFishComposeTheme
import ui.auth.LoginScreen
import ui.main.MainScreen
import utils.AppLog


@Composable
@Preview
fun App() {
    AppLog.init()
    KoinApplication(application = {
        modules(appModules)
    }) {
        PreComposeApp {
            JellyFishComposeTheme() {
                RootNavHost()
            }
        }
    }

    Napier.base(DebugAntilog())

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

                navigator.navigate(AppScreen.Main.route)

            }, navigateToSignUp = {

            })

        }

        scene(
            route = AppScreen.Main.route,
            navTransition = NavTransition(),
        ) {
            MainScreen()

        }

    }


}
