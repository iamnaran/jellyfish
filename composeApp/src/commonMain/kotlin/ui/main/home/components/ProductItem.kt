package ui.main.home.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.unit.dp
import domain.model.ProductDto
import themes.dimens

@Composable
fun ProductItem(productEntity: ProductDto, onProductItemClick: (String) -> Unit) {

    Card(
        modifier = Modifier
            .padding(MaterialTheme.dimens.regular)
            .shadow(
                elevation = 5.dp,
                spotColor = MaterialTheme.colorScheme.secondaryContainer,
                shape = MaterialTheme.shapes.medium
            )
            .clickable {
                onProductItemClick(productEntity.id.toString())
            },
        shape = MaterialTheme.shapes.medium
    ) {
        Column(
            Modifier
                .fillMaxWidth(),
        ) {
//            AsyncImage(
//                model = productEntity.thumbnail,
//                contentDescription = productEntity.title,
//                modifier = Modifier
//                    .background(MaterialTheme.colorScheme.secondaryContainer)
//                    .fillMaxWidth()
//                    .height(150.dp),
//                contentScale = ContentScale.Crop,
//            )

            Column(
                Modifier
                    .padding(10.dp),
            ) {
                Text(
                    text = productEntity.price.toString(),
                    color = MaterialTheme.colorScheme.onSecondaryContainer,
                    modifier = Modifier.padding(8.dp)
                )

                Text(
                    text = productEntity.title,
                    maxLines = 2,
                    color = MaterialTheme.colorScheme.onTertiaryContainer,
                    modifier = Modifier.padding(8.dp)
                )

                Text(
                    text = productEntity.description,
                    maxLines = 2,
                    color = MaterialTheme.colorScheme.onTertiaryContainer,
                    modifier = Modifier.padding(8.dp)
                )

                Spacer(modifier = Modifier.height(8.dp))

            }
        }
    }

}