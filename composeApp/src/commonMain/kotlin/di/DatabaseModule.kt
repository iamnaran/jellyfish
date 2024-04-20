package di

import data.local.dao.product.ProductDao
import data.local.dao.product.ProductDaoImpl
import data.local.db.SharedDatabase
import org.koin.dsl.module

val databaseModule = module {

    single { SharedDatabase(get()) }

    single<ProductDao> { ProductDaoImpl(get()) }

}