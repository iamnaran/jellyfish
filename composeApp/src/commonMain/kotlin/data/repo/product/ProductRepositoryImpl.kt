package data.repo.product

import data.local.dao.product.ProductDao
import data.remote.ProductApiService
import domain.model.ProductDto
import kotlinx.coroutines.flow.Flow

class ProductRepositoryImpl(
    private val productApiService: ProductApiService,
    private val productDao: ProductDao,
) : ProductRepository {
    override suspend fun getAllProducts(): Flow<List<ProductDto>> {
        TODO("Not yet implemented")
    }


}