package domain.model

data class ProductDto(
    val id: Long,
    val title: String,
    val description: String,
    val brand: String,
    val price: Long,
    val stock: String,
    val rating: String,
    val thumbnail: String,
)