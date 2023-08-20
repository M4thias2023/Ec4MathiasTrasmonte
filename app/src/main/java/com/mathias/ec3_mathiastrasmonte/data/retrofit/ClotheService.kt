package com.mathias.ec4_mathiastrasmonte.data.retrofit

import com.mathias.ec4_mathiastrasmonte.model.Clothe
import retrofit2.http.GET


interface ClotheService {
    @GET("products?limit=10")
    suspend fun getClothes(): List<Clothe>

}