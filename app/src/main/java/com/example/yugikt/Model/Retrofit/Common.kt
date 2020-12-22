package com.example.yugikt.Model.Retrofit

import com.example.yugikt.Model.Interface.RetrofitService

object Common {

    private val BASE_URL = " https://raw.githubusercontent.com/Raffael93/ProjetYuGiOhKT/master/app/src/main/java/com/example/yugikt/"

    val retrofitService : RetrofitService
    get() = RetrofitClient.getClient(BASE_URL).create(RetrofitService::class.java)

}