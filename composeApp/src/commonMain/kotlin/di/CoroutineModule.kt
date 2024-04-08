package di

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import org.koin.dsl.module


object CoroutineModule {

    val coroutine = module {
        single { Dispatchers.Default }
        single { CoroutineScope(Dispatchers.Main + Job()) }
    }

}