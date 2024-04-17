package ui.navigation.bottombar

import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import moe.tlaster.precompose.navigation.NavOptions
import moe.tlaster.precompose.navigation.Navigator
import ui.navigation.AppScreen
import ui.navigation.currentRoute

@Composable
fun BottomBar(
    navigator: Navigator,
) {
    val navigationScreen = listOf(
        AppScreen.Main.Home,
        AppScreen.Main.Notification,
        AppScreen.Main.Explore,
        AppScreen.Main.Profile
    )

    NavigationBar {
        navigationScreen.forEach {
            NavigationBarItem(label = { Text(text = it.title) },
                selected = it.route  == currentRoute(navigator) || currentRoute(navigator) == AppScreen.Main.route,
                icon = {
//                    Icon(
//                        painterResource(if (it.route == currentRoute(navigator)) it.selectedIcon else it.unSelectedIcon),
//                        it.title
//                    )
                },
                onClick = {
                    navigator.navigate(
                        it.route,
                        NavOptions(
                            launchSingleTop = true,
                        ),
                    )
                })
        }
    }
}