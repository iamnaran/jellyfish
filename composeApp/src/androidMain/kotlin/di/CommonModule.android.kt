package di

import data.local.db.DriverFactory
import org.koin.dsl.module

actual fun platformModule() = module {
    single<DriverFactory> { DriverFactory(get()) }
}
