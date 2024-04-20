package com.delphiclab.jellyfish

import App
import android.content.Context
import android.content.pm.ApplicationInfo
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.compose.KoinContext
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import utils.ContextUtils

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ContextUtils.setContext(context = this)
        setContent {
            App()
        }
    }
}

fun Context.isDebug() = 0 != applicationInfo.flags and ApplicationInfo.FLAG_DEBUGGABLE


@Preview
@Composable
fun AppAndroidPreview() {
    App()
}