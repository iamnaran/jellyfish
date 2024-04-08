package data.model

import kotlinx.serialization.Serializable

@Serializable
data class LoginResponse(
    val author: String,
    val category: String,
    val quote: String
)