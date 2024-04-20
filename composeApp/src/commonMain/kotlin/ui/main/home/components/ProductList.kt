package ui.main.home.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import domain.model.ProductDto


@Composable
fun ProductList(allProductEntities: List<ProductDto>, onProductClick: (String) -> Unit) {
    LazyColumn {
        items(items = allProductEntities, key = { item -> item.id }) { product ->
            ProductItem(product) {
                onProductClick(product.id.toString())
            }
        }
    }
}

