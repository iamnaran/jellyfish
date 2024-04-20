package ui.main.home

import domain.model.ProductDto

data class HomeState(
    val allProductEntities: List<ProductDto> = emptyList()
)
