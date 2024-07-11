package com.iamnaran.jellyfish.di

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.IO
import org.koin.core.qualifier.named
import org.koin.dsl.module

val coroutineModule = module {
    single(named("DefaultDispatcher")) { Dispatchers.Default }
    single(named("IoDispatcher")) { Dispatchers.IO }
    single(named("MainDispatcher")) { Main }
    single(named("MainImmediateDispatcher")) { Main.immediate }

}