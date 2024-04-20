package data.local.dao.product

import data.local.entity.ProductEntity
import kotlinx.coroutines.flow.Flow

interface ProductDao {

    fun getAllProducts(): Flow<List<ProductEntity>>

    fun saveAllProducts(productEntities: List<ProductEntity>)

}