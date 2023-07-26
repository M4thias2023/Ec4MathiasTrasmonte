package com.mathias.ec3_mathiastrasmonte.data.retrofit

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object ServiceInstance {
    private val retrofit= Retrofit.Builder()
        .baseUrl("https://fakestoreapi.com/")
        .client(OkHttpClient())
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    fun getClotheService(): ClotheService = retrofit.create(ClotheService::class.java)

}