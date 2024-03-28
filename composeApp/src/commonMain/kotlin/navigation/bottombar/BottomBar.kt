package navigation.bottombar

import androidx.compose.material3.NavigationBar
import androidx.compose.runtime.Composable
import moe.tlaster.precompose.navigation.Navigator
import navigation.AppScreen

@Composable
fun BottomBar(
    navigator: Navigator,
) {
    val navigationScreen = listOf(
        AppScreen.Main.Home, AppScreen.Main.Notification, AppScreen.Main.Profile
    )

    NavigationBar {

    }
}