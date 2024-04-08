package data.remote

import data.model.LoginResponse
import io.ktor.client.HttpClient
import io.ktor.client.request.forms.FormDataContent
import io.ktor.client.request.url
import io.ktor.http.HttpMethod
import io.ktor.http.Parameters
import io.ktor.util.InternalAPI
import kotlinx.coroutines.flow.Flow
import utils.ApiResponse
import utils.safeRequestWithFlow

class AuthApiService(private val httpClient: HttpClient) {

    @OptIn(InternalAPI::class)
    suspend fun serverLogin(
        username: String,
        password: String
    ): Flow<ApiResponse<LoginResponse>> = httpClient.safeRequestWithFlow {
        method = HttpMethod.Post
        url(ApiEndPoints.LOGIN_URL)
        body = FormDataContent(Parameters.build {
            append("username", username)
            append("password", password)
        })

    }

}