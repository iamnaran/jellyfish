package data.repo.home

import data.local.dao.product.ProductDao
import data.remote.HomeApiService
import domain.model.ProductDto
import kotlinx.coroutines.flow.Flow
import utils.Resource
import utils.networkBoundResource

class HomeRepositoryImpl(
    private val homeApiService: HomeApiService,
    private val productDao: ProductDao
) : HomeRepository{
    override suspend fun getAllProducts() = networkBoundResource(
        query = {
            productDao.getAllProducts()
        },
        fetch = {
            homeApiService.getAllProducts()
        },
        saveFetchResult = { products ->
            productDao.saveAllProducts(products)
        }
    )


    override suspend fun saveAllProducts(book: List<ProductDto>) {


    }

}