package com.iamnaran.jellyfish.data.remote

import com.iamnaran.jellyfish.data.HomeResponse
import com.iamnaran.jellyfish.utils.ApiResponse
import com.iamnaran.jellyfish.utils.safeRequest
import io.ktor.client.HttpClient
import io.ktor.client.request.url
import io.ktor.http.HttpMethod

class ProductApiService(private val httpClient: HttpClient) {

    suspend fun getAllProducts(): ApiResponse<HomeResponse> = httpClient.safeRequest {
        method = HttpMethod.Get
        url(ApiEndPoints.PRODUCTS_URL)
    }

}