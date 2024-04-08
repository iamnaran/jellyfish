package utils

import io.github.aakira.napier.DebugAntilog
import io.github.aakira.napier.Napier

class AppLog private constructor() {
    companion object {
        fun init() {
            Napier.base(DebugAntilog())
        }

        fun showDebug(tag: String, message: String) {
            Napier.d(tag = tag, message = message)
        }

        fun showLog(message: String) {
            Napier.v(message)
        }

        fun showError(tag: String, message: String) {
            Napier.e(tag = tag, message = message)
        }

        fun showException(throwable: Throwable, message: String) {
            Napier.e(throwable = throwable, message = message)
        }
    }
}