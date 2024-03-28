package di

import moe.tlaster.precompose.viewmodel.viewModel
import org.koin.dsl.module
import ui.auth.LoginViewModel

val viewModelModule = module {
    
    viewModel { LoginViewModel() }

}