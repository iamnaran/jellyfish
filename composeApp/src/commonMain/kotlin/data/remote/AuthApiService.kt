package data.remote

import data.model.LoginResponse
import kotlinx.coroutines.flow.Flow
import utils.ApiResponse

interface AuthApiService {
    suspend fun serverLogin(username: String, password: String): ApiResponse<LoginResponse>

    suspend fun serverLoginWithFlow(username: String, password: String): Flow<ApiResponse<LoginResponse>>
}