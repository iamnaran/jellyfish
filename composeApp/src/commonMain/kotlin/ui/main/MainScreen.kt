package ui.main

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.remember
import moe.tlaster.precompose.navigation.rememberNavigator
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
@Composable
fun MainScreen(){

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


    Scaffold { paddingValues ->

        Box(modifier = Modifier.padding(paddingValues)) {
            Text("Main Screen")
        }

    }


}