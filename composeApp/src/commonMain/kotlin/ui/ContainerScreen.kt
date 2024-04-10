package ui

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.remember
import moe.tlaster.precompose.navigation.rememberNavigator
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import ui.navigation.AppScreen
import ui.navigation.RootNavHost
import ui.navigation.bottombar.BottomBar
import ui.navigation.topbar.AppTopBar

@Composable
fun ContainerScreen(){

    ContainerContent()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ContainerContent() {

    val navigator = rememberNavigator()
    val topAppbarTitle = remember { mutableStateOf("") }
    val topAppBarState = rememberTopAppBarState()
    val barScrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(state = topAppBarState)
    val showBottomBarState = rememberSaveable { (mutableStateOf(true)) }
    val showTopBarState = rememberSaveable { (mutableStateOf(true)) }
    val snackbarHostState = remember { SnackbarHostState() }



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

            RootNavHost()

        }
    }


}