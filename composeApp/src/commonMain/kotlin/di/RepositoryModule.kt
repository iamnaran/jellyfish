package di

import data.repo.AuthRepository
import data.repo.AuthRepositoryImpl
import org.koin.dsl.module

val repositoryModule = module {

    single<AuthRepository> { AuthRepositoryImpl() }

}