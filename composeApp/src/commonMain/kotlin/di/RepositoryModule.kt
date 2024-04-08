package di

import data.repo.HomeRepository
import data.repo.HomeRepositoryImpl
import org.koin.dsl.module

val repositoryModule = module {

    single<HomeRepository> { HomeRepositoryImpl() }

}