package com.iamnaran.jellyfish.utils

sealed class ApiResponseWithError<out T, out E> {

    data class Success<T>(val body: T) : ApiResponseWithError<T, Nothing>()

    sealed class Error<E> : ApiResponseWithError<Nothing, E>() {

        data class HttpError<E>(val code: Int, val errorBody: E?) : Error<E>()

        data object NetworkError : Error<Nothing>()

        data object SerializationError : Error<Nothing>()
    }
}


sealed class ApiResponse<out T> {

    data class Success<T>(val body: T) : ApiResponse<T>()
    data class Loading<T>(val message: String = "Please wait...") : ApiResponse<T>()

    sealed class Error : ApiResponse<Nothing>() {

        data class HttpError(val code: Int, val errorBody: Any?) : Error()

        data object NetworkError : Error()

        data object SerializationError : Error()
    }
}