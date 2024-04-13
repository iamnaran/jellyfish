package ui.main

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import moe.tlaster.precompose.koin.koinViewModel
import moe.tlaster.precompose.navigation.rememberNavigator
import ui.navigation.AppScreen
import ui.navigation.RootNavHost
import ui.navigation.bottombar.BottomBar
import ui.navigation.currentRoute
import ui.navigation.topbar.AppTopBar
import utils.AppLog

@Composable
fun MainScreen(viewModel: MainViewModel = koinViewModel(MainViewModel::class)) {

    MainContent()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainContent() {

    val navigator = rememberNavigator()
    val topAppbarTitle = remember { mutableStateOf("") }
    val topAppBarState = rememberTopAppBarState()
    val barScrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(state = topAppBarState)
    val showBottomBarState = rememberSaveable { (mutableStateOf(true)) }
    val showTopBarState = rememberSaveable { (mutableStateOf(true)) }
    val snackbarHostState = remember { SnackbarHostState() }

    val currentRoute = currentRoute(navigator)

    when (currentRoute) {
        AppScreen.Main.route -> {
            showBottomBarState.value = true
            showTopBarState.value = true
        }

        AppScreen.Main.Home.route -> {
            AppLog.showLog("CALLED" + "1")
            showBottomBarState.value = true
            showTopBarState.value = true
            topAppbarTitle.value = "Home"
        }

        AppScreen.Main.Profile.route -> {
            AppLog.showLog("CALLED" + "2")
            showBottomBarState.value = true
            showTopBarState.value = true
            topAppbarTitle.value = "Profile"

        }

        AppScreen.Main.Notification.route -> {
            showBottomBarState.value = true
            showTopBarState.value = true
            topAppbarTitle.value = "Notification"
        }

        AppScreen.Main.Explore.route -> {
            showBottomBarState.value = true
            showTopBarState.value = true
            topAppbarTitle.value = "Explore"
        }

        else -> {
            AppLog.showLog("CALLED" + "None")
            showBottomBarState.value = false
            showTopBarState.value = false
            topAppbarTitle.value = "Apple"

        }
    }


    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .nestedScroll(barScrollBehavior.nestedScrollConnection),
        snackbarHost = {
            SnackbarHost(hostState = snackbarHostState)
        },
        topBar = {
            if (showTopBarState.value) {
                AppTopBar(topAppbarTitle.value,
                    barScrollBehavior,
                    onActionCameraClick = {

                    }
                )
            } else {
                Box {

                }
            }
        },
        bottomBar = {
            if (showBottomBarState.value) {
                BottomBar(navigator)
            }
        }) { paddingValues ->
        Box(
            modifier = Modifier
                .padding(paddingValues)
        ) {

            RootNavHost(navigator)

        }
    }


}