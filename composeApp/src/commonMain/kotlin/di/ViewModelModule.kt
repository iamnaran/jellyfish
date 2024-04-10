package di

import org.koin.dsl.module
import ui.auth.LoginViewModel
import ui.main.explore.ExploreViewModel
import ui.main.home.HomeViewModel

val viewModelModule = module {

    factory { LoginViewModel(get()) }
    factory { HomeViewModel() }
    factory { ExploreViewModel() }

}