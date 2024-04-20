package di

import domain.GetProductsUseCase
import domain.PostServerLoginUseCase
import org.koin.dsl.module

val useCaseModule = module {
    single { PostServerLoginUseCase(get()) }
    single { GetProductsUseCase(get()) }
}