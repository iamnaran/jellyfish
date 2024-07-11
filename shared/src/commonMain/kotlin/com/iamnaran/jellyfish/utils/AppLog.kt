package com.iamnaran.jellyfish.utils

import io.github.aakira.napier.DebugAntilog
import io.github.aakira.napier.Napier

private const val debugIdentifier = "JELLYFISH --> "

class AppLog private constructor() {

    companion object {

        fun init() {
            Napier.base(DebugAntilog())
        }

        fun showDebug(tag: String, message: String) {
            Napier.d(tag = tag, message = debugIdentifier + message)
        }

        fun showLog(message: String) {
            Napier.v(debugIdentifier + message)
        }

        fun showError(tag: String, message: String) {
            Napier.e(tag = tag, message = debugIdentifier + message)
        }

        fun showException(throwable: Throwable, message: String) {
            Napier.e(throwable = throwable, message = debugIdentifier + message)
        }
    }
}

