package data.repo

interface AuthRepository {

    fun serverLogin(username: String, password: String)

}