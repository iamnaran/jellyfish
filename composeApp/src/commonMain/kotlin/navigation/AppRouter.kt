package navigation

private object Routes {

    const val AUTH = "auth"
    const val LOGIN = "login"
    const val REGISTER = "signup"

    const val MAIN = "main"
    const val HOME = "home"
    const val PROFILE = "profile"
    const val NOTIFICATION = "notification"

}


sealed class AppScreen(val route: String) {
    data object Auth : AppScreen(Routes.AUTH) {
        data object Login : AppScreen(Routes.LOGIN)
        data object Register : AppScreen(Routes.REGISTER)
    }

    data object Main : TopLevelDestination(Routes.MAIN) {
        data object Home : TopLevelDestination(Routes.HOME)
        data object Notification : TopLevelDestination(Routes.NOTIFICATION)
        data object Profile : TopLevelDestination(Routes.PROFILE)

    }

}

sealed class TopLevelDestination(
    val route: String
)
