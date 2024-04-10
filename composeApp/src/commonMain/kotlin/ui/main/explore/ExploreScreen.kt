package ui.main.explore

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import moe.tlaster.precompose.koin.koinViewModel

@Composable
fun ExploreScreen(
    viewModel: ExploreViewModel = koinViewModel(ExploreViewModel::class),
    onProductClick: (String) -> Unit,
) {

    ExploreContent(onProductClick)
}

@Composable
fun ExploreContent(onProductClick: (String) -> Unit) {
    Column {
        Text("Explore Screen")

    }

}