package com.mainal.retrofit_kotlin

interface ApiService {
    @GET( "character")
    fun getRick(): MainActivity.retrofit2.Call<ResponseRick>

    annotation class GET(val value: String)

    class ResponseRick {

    }

}