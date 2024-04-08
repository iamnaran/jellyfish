package utils

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.ClientRequestException
import io.ktor.client.plugins.ResponseException
import io.ktor.client.plugins.ServerResponseException
import io.ktor.client.request.HttpRequestBuilder
import io.ktor.client.request.request
import io.ktor.client.statement.bodyAsText
import io.ktor.http.HttpStatusCode
import io.ktor.utils.io.errors.IOException
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.serialization.SerializationException

suspend inline fun <reified T> HttpClient.fetch(
    block: HttpRequestBuilder.() -> Unit
): Result<T> = try {
    val response = request(block)
    if (response.status == HttpStatusCode.OK)
        Result.Success(response.body())
    else
        Result.Error(Throwable("${response.status}: ${response.bodyAsText()}"))
} catch (e: Exception) {
    Result.Error(e)
}

sealed interface Result<out R> {
    class Success<out R>(val value: R) : Result<R>
    data object Loading : Result<Nothing>
    class Error(val throwable: Throwable) : Result<Nothing>
}


suspend inline fun <reified T> HttpClient.safeRequest(
    callback: HttpRequestBuilder.() -> Unit,
): ApiResponse<T> =
    try {
        val response = request { callback() }
        ApiResponse.Success(response.body())
    } catch (e: ClientRequestException) {
        ApiResponse.Error.HttpError(e.response.status.value, e.errorBody())
    } catch (e: ServerResponseException) {
        ApiResponse.Error.HttpError(e.response.status.value, e.errorBody())
    } catch (e: IOException) {
        ApiResponse.Error.NetworkError
    } catch (e: SerializationException) {
        ApiResponse.Error.SerializationError
    }


inline fun <reified T> HttpClient.safeRequestWithFlow(
    crossinline callback: HttpRequestBuilder.() -> Unit,
): Flow<ApiResponse<T>> = flow {
    try {
        val response = request { callback() }
        emit(ApiResponse.Success(response.body()))
    } catch (e: ClientRequestException) {
        emit(ApiResponse.Error.HttpError(e.response.status.value, e.errorBody()))
    } catch (e: ServerResponseException) {
        emit(ApiResponse.Error.HttpError(e.response.status.value, e.errorBody()))
    } catch (e: IOException) {
        emit(ApiResponse.Error.NetworkError)
    } catch (e: SerializationException) {
        emit(ApiResponse.Error.SerializationError)
    }
}


suspend inline fun <reified T, reified E> HttpClient.safeRequestWithError(
    callback: HttpRequestBuilder.() -> Unit,
): ApiResponseWithError<T, E> =
    try {
        val response = request { callback() }
        ApiResponseWithError.Success(response.body())
    } catch (e: ClientRequestException) {
        ApiResponseWithError.Error.HttpError(e.response.status.value, e.errorBody())
    } catch (e: ServerResponseException) {
        ApiResponseWithError.Error.HttpError(e.response.status.value, e.errorBody())
    } catch (e: IOException) {
        ApiResponseWithError.Error.NetworkError
    } catch (e: SerializationException) {
        ApiResponseWithError.Error.SerializationError
    }

suspend inline fun <reified E> ResponseException.errorBody(): E? =
    try {
        response.body()
    } catch (e: SerializationException) {
        null
    }
