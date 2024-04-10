package ui.navigation.bottombar

import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import moe.tlaster.precompose.navigation.NavOptions
import moe.tlaster.precompose.navigation.Navigator
import ui.navigation.AppScreen

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
                selected = it.route == currentRoute(navigator),
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

@Composable
fun currentRoute(navigator: Navigator): String? {
    return navigator.currentEntry.collectAsState(null).value?.route?.route
}