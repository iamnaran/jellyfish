package data.local.db

import com.delphiclab.jellyfish.db.AppDatabase

class SharedDatabase(
    private val driverProvider: DriverFactory,
) {

    private var database: AppDatabase? = null

    suspend operator fun <R> invoke(block: suspend (AppDatabase) -> R): R {
        initDatabase()
        return block(database!!)
    }

    private suspend fun initDatabase() {
        if (database == null) {
            database = AppDatabase.invoke(
                driverProvider.createDriver(),
            )
        }
    }
}