package data.local.dao.product

import domain.model.ProductDto
import kotlinx.coroutines.flow.Flow

interface ProductDao {

    suspend fun getAllProducts(): Flow<List<ProductDto>>

    suspend fun saveAllProducts(productEntities: List<ProductDto>)

}