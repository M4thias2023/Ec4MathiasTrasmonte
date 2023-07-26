package com.mathias.ec3_mathiastrasmonte.data.retrofit

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceInstance {
    private val retrofit= Retrofit.Builder()
        .baseUrl("https://run.mocky.io/v3/")
        .client(OkHttpClient())
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    fun getClotheService(): ClotheService = retrofit.create(ClotheService::class.java)

}