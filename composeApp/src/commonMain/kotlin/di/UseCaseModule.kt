package di

import domain.PostServerLoginUseCase
import org.koin.dsl.module

val useCaseModule = module {
    single { PostServerLoginUseCase(get()) }
}