import androidx.compose.runtime.Composable
import di.appModules
import moe.tlaster.precompose.PreComposeApp
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.KoinApplication
import themes.JellyFishComposeTheme
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
                MainScreen()
            }
        }
    }
}
