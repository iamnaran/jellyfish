package com.iamnaran.jellyfish

import androidx.compose.runtime.Composable
import com.iamnaran.jellyfish.di.appModules
import com.iamnaran.jellyfish.utils.AppLog
import org.koin.compose.KoinApplication


@Composable
fun App() {
    AppLog.init()
    KoinApplication(application = {
        modules(appModules)
    }) {



    }
}