package di

val appModules = listOf(
    NetworkModule.httpModule,
    NetworkModule.authServices,
    coroutineModule,
    repositoryModule,
    viewModelModule,
    useCaseModule,
    databaseModule,
    platformModule()
)