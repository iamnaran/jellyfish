package utils

import io.github.aakira.napier.DebugAntilog
import io.github.aakira.napier.Napier

class AppLog private constructor() {


    companion object {
        private const val appDebugIdentifier = "JellyFish --> "

        fun init() {
            Napier.base(DebugAntilog())
        }

        fun showDebug(tag: String, message: String) {
            Napier.d(tag = tag, message = appDebugIdentifier + message)
        }

        fun showLog(message: String) {
            Napier.v(appDebugIdentifier + message)
        }

        fun showError(tag: String, message: String) {
            Napier.e(tag = tag, message = appDebugIdentifier + message)
        }

        fun showException(throwable: Throwable, message: String) {
            Napier.e(throwable = throwable, message = appDebugIdentifier + message)
        }
    }
}