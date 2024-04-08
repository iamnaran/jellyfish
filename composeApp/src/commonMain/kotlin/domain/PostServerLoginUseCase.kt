package domain

import data.remote.AuthApiService

class PostServerLoginUseCase(
    private val authApiService: AuthApiService
) {
    suspend operator fun invoke(username: String, password: String) =
        authApiService.serverLogin(username, password)

}