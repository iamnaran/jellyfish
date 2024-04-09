package ui.main.home

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import moe.tlaster.precompose.koin.koinViewModel

@Composable
fun HomeScreen(
    viewModel: HomeViewModel = koinViewModel(HomeViewModel::class),
    onProductClick: (String) -> Unit,
) {
    val homeState by viewModel.homeState.collectAsState()

    HomeContent(homeState) {
        onProductClick(it)
    }

}

@Composable
fun HomeContent(homeState: HomeState, onProductClick: (String) -> Unit) {
    Column {
//        ProductList(homeState.allProductEntities) {
//            onProductClick(it)
//        }
    }

}