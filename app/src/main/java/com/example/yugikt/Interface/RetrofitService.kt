package com.example.yugikt.Interface



import com.example.yugikt.Model.Card
import retrofit2.http.GET
import retrofit2.Call

interface RetrofitService {


    @GET("api.json")
    fun getCards(): Call<MutableList<Card>>


}