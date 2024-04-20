package di

val appModules = listOf(
    NetworkModule.httpModule,
    NetworkModule.authServices,
    CoroutineModule.coroutine,
    repositoryModule,
    viewModelModule,
    useCaseModule,
    databaseModule,
    platformModule()
)