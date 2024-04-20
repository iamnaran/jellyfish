package data.local.dao.product

import com.delphiclab.jellyfish.db.AppDatabase
import data.local.db.DriverFactory
import data.local.entity.ProductEntity
import kotlinx.coroutines.flow.Flow

class ProductDaoImpl(private val databaseDriverFactory: DriverFactory) : ProductDao {

    private val appDatabase = AppDatabase(driver = databaseDriverFactory.createDriver())
    override fun getAllProducts(): Flow<List<ProductEntity>> {
        return TODO("Provide the return value")
    }


    override fun saveAllProducts(productEntities: List<ProductEntity>) {

    }
}