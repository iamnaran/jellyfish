package data.remote

import data.model.LoginResponse
import io.ktor.client.HttpClient
import io.ktor.client.request.url
import io.ktor.http.HttpMethod
import kotlinx.coroutines.flow.Flow
import utils.ApiResponse
import utils.safeRequestWithFlow

class AuthApiService(private val httpClient: HttpClient)  {

    suspend fun serverLogin(
        username: String,
        password: String
    ): Flow<ApiResponse<LoginResponse>> = httpClient.safeRequestWithFlow {
        method = HttpMethod.Get
        url(ApiEndPoints.PRODUCTS_URL)

    }

}