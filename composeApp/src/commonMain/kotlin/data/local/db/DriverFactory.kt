package data.local.db

import app.cash.sqldelight.db.SqlDriver
import com.delphiclab.jellyfish.db.AppDatabase


expect class DriverFactory {
    fun createDriver(): SqlDriver
}

fun createDatabase(driverFactory: DriverFactory): AppDatabase {
    val driver = driverFactory.createDriver()
    return AppDatabase(driver)
}