package data.remote

object ApiEndPoints {
//    const val BASE_URL = BuildConfig

    // yep--no slash unlike retrofit :)
    private const val BASE_URL = "https://dummyjson.com"

    //auth
    const val LOGIN_URL = "$BASE_URL/auth/login"


    //products
    const val PRODUCTS_URL = "$BASE_URL/products"

}