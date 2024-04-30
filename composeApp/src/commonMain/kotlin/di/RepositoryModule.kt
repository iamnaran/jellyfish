package di

import data.repo.product.ProductRepository
import data.repo.product.ProductRepositoryImpl
import org.koin.dsl.module

val repositoryModule = module {

//    single<ProductRepository> { ProductRepositoryImpl(get()) }


}