package data.remote

import data.model.HomeResponse
import io.ktor.client.HttpClient
import io.ktor.client.request.url
import io.ktor.http.HttpMethod
import kotlinx.coroutines.flow.Flow
import utils.ApiResponse
import utils.safeRequestWithFlow

class HomeApiService(private val httpClient: HttpClient) {

    suspend fun getAllProducts(): Flow<ApiResponse<HomeResponse>> = httpClient.safeRequestWithFlow {
        method = HttpMethod.Get
        url(ApiEndPoints.PRODUCTS_URL)
    }

}