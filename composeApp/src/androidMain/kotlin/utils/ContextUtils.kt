package utils

import android.content.Context

object ContextUtils {

    private var jellyFishAppContext: Context? = null

    val context
        get() = jellyFishAppContext
            ?: error("Set Context in your Application's onCreate.")

    fun setContext(context: Context) {
        jellyFishAppContext = context.applicationContext
    }
}