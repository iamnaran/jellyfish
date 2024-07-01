package com.iamnaran.jellyfish

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform