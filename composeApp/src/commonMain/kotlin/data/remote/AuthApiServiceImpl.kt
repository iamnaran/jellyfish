package data.remote

import data.model.LoginResponse
import io.ktor.client.HttpClient
import io.ktor.client.request.forms.formData
import io.ktor.client.request.parameter
import io.ktor.client.request.url
import io.ktor.http.HttpMethod
import kotlinx.coroutines.flow.Flow
import utils.ApiResponse
import utils.safeRequest
import utils.safeRequestWithFlow

class AuthApiServiceImpl(private val httpClient: HttpClient) : AuthApiService {

    override suspend fun serverLogin(username: String, password: String): ApiResponse<LoginResponse> {
        return httpClient.safeRequest {
            method = HttpMethod.Get
            url(ApiEndPoints.LOGIN_URL)
            formData {
                parameter("username", username)
                parameter("password", password)
            }
        }
    }

    override suspend fun serverLoginWithFlow(
        username: String,
        password: String
    ): Flow<ApiResponse<LoginResponse>> = httpClient.safeRequestWithFlow {
        method = HttpMethod.Get
        url(ApiEndPoints.PRODUCTS_URL)

    }

}