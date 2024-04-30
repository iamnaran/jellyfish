package di

import org.koin.dsl.module
import ui.auth.LoginViewModel
import ui.main.MainViewModel
import ui.main.explore.ExploreViewModel
import ui.main.home.HomeViewModel

val viewModelModule = module {

    factory { MainViewModel() }
    factory { LoginViewModel(get()) }
    factory { HomeViewModel(get()) }
    factory { ExploreViewModel() }

}