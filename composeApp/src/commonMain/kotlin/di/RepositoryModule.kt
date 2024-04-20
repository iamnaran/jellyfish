package di

import data.repo.home.HomeRepository
import data.repo.home.HomeRepositoryImpl
import org.koin.dsl.module

val repositoryModule = module {

    single<HomeRepository> { HomeRepositoryImpl(get(),get()) }


}