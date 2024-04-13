package ui.navigation

import androidx.compose.ui.graphics.vector.ImageVector
import jellyfish.composeapp.generated.resources.Res
import jellyfish.composeapp.generated.resources.home
import org.jetbrains.compose.resources.ExperimentalResourceApi

private object Routes {

    const val AUTH = "/auth"
    const val LOGIN = "/login"
    const val REGISTER = "/signup"

    const val MAIN = "/main"
    const val HOME = "/home"
    const val PROFILE = "/profile"
    const val EXPLORE = "/explore"
    const val NOTIFICATION = "/notification"

}


sealed class AppScreen(val route: String) {
    data object Auth : AppScreen(Routes.AUTH) {
        data object Login : AppScreen(Routes.LOGIN)
        data object Register : AppScreen(Routes.REGISTER)
    }

    @OptIn(ExperimentalResourceApi::class)
    data object Main : TopLevelDestination(Routes.MAIN) {
        data object Home : TopLevelDestination(Routes.HOME, "Home")
        data object Notification : TopLevelDestination(Routes.NOTIFICATION, "Notification")
        data object Profile : TopLevelDestination(Routes.PROFILE, "Profile")

        data object Explore : TopLevelDestination(Routes.EXPLORE, "Explore")

    }

}

sealed class TopLevelDestination(
    val route: String,
    val title: String = "",
    val selectedIcon: ImageVector? = null,
    val unselectedIcon: ImageVector? = null,
)
