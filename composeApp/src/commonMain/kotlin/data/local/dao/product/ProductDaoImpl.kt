package data.local.dao.product

import app.cash.sqldelight.coroutines.asFlow
import com.delphiclab.jellyfish.db.Product
import data.local.db.SharedDatabase
import domain.model.ProductDto
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class ProductDaoImpl(
    private val sharedDatabase: SharedDatabase,
    private val ioDispatcher: CoroutineDispatcher
) : ProductDao {
    override suspend fun getAllProducts(): Flow<List<ProductDto>> = sharedDatabase { appDatabase ->
        appDatabase.appDatabaseQueries.selectAllProduct(::mapProduct).asFlow()
            .map { it.executeAsList() }
    }

    override suspend fun saveAllProducts(productEntities: List<ProductDto>) {
        sharedDatabase { appDatabase ->
            appDatabase.transaction {
                productEntities.forEach { product ->
                    appDatabase.appDatabaseQueries.insert(
                        product.id,
                        product.title,
                        product.description,
                        product.brand,
                        product.price.toLong(),
                        product.stock,
                        product.rating,
                        product.thumbnail,
                    )
                }
            }
        }

    }

    private fun mapProduct(
        id: Long,
        title: String,
        description: String,
        brand: String,
        price: Long,
        rating: String,
        stock: String,
        thumbnail: String,
    ): ProductDto =
        ProductDto(id, title, description, brand, price, rating, stock, thumbnail)
}