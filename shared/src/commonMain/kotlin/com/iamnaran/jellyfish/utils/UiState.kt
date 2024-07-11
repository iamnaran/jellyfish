package com.iamnaran.jellyfish.utils

sealed class UiState<out T> {
    data object Loading : UiState<Nothing>()
    data class Success<out T : Any?>(val data: T) : UiState<T>()
    data class Error(val error: String) : UiState<Nothing>()
}