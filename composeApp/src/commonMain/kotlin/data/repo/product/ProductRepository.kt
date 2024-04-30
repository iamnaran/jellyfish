package data.repo.product

import domain.model.ProductDto
import kotlinx.coroutines.flow.Flow
import utils.Resource

interface ProductRepository{
    suspend fun getAllProducts(): Flow<List<ProductDto>>



}