package data.repo.home

import data.local.dao.product.ProductDao
import data.remote.HomeApiService
import domain.model.ProductDto
import kotlinx.coroutines.flow.Flow
import utils.Resource

interface HomeRepository{

    suspend fun getAllProducts(): Flow<Resource<List<ProductDto>>>


    suspend fun saveAllProducts(book: List<ProductDto>)



}