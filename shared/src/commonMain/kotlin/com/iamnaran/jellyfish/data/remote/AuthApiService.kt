package com.iamnaran.jellyfish.data.remote

import com.iamnaran.jellyfish.data.LoginResponse
import com.iamnaran.jellyfish.utils.ApiResponse
import com.iamnaran.jellyfish.utils.safeRequestWithFlow
import io.ktor.client.HttpClient
import io.ktor.client.request.forms.FormDataContent
import io.ktor.client.request.url
import io.ktor.http.HttpMethod
import io.ktor.http.Parameters
import io.ktor.util.InternalAPI
import kotlinx.coroutines.flow.Flow

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