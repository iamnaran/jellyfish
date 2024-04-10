package ui.navigation

import androidx.compose.runtime.Composable
import moe.tlaster.precompose.navigation.NavHost
import moe.tlaster.precompose.navigation.rememberNavigator
import moe.tlaster.precompose.navigation.transition.NavTransition
import ui.auth.LoginScreen
import ui.main.explore.ExploreScreen
import ui.main.home.HomeScreen
import ui.main.notification.NotificationScreen
import ui.main.profile.ProfileScreen

@Composable
fun RootNavHost() {
    val navigator = rememberNavigator()
    NavHost(
        navigator = navigator,
        navTransition = NavTransition(),
        initialRoute = AppScreen.Auth.Login.route,
    ) {

        group(
            route = AppScreen.Auth.route,
            initialRoute = AppScreen.Auth.Login.route
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

        }


        group(
            route = AppScreen.Main.route,
            initialRoute = AppScreen.Main.Home.route
        ) {
            scene(
                route = AppScreen.Main.Home.route,
                navTransition = NavTransition(),
            ) {

                HomeScreen(onProductClick = {
                })

            }

            scene(
                route = AppScreen.Main.Notification.route,
                navTransition = NavTransition(),
            ) {
                NotificationScreen()
            }

            scene(
                route = AppScreen.Main.Profile.route,
                navTransition = NavTransition(),
            ) {
                ProfileScreen()
            }

            scene(
                route = AppScreen.Main.Explore.route,
                navTransition = NavTransition(),
            ) {
                ExploreScreen(){

                }

            }

        }

    }

}