package data.remote

import data.model.HomeResponse
import io.ktor.client.HttpClient
import io.ktor.client.request.url
import io.ktor.http.HttpMethod
import utils.ApiResponse
import utils.safeRequest

class ProductApiService(private val httpClient: HttpClient) {

    suspend fun getAllProducts(): ApiResponse<HomeResponse> = httpClient.safeRequest {
        method = HttpMethod.Get
        url(ApiEndPoints.PRODUCTS_URL)
    }

}