package navigation

import androidx.compose.ui.graphics.vector.ImageVector

private object Routes {

    const val AUTH = "auth"
    const val LOGIN = "login"
    const val REGISTER = "signup"

    const val MAIN = "main"
    const val HOME = "home"
    const val PROFILE = "profile"

}


sealed class AppScreen(val route: String) {
    data object Auth : AppScreen(Routes.AUTH) {
        data object Login : AppScreen(Routes.LOGIN)
        data object Register : AppScreen(Routes.REGISTER)
    }

    data object Main : TopLevelDestination(Routes.MAIN) {

    }

}

sealed class TopLevelDestination(
    val route: String,
//    val title: Int? = null,
    val selectedIcon: ImageVector? = null,
    val unselectedIcon: ImageVector? = null,
//    val navArguments: List<NamedNavArgument> = emptyList()
)
