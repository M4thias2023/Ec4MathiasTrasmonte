package com.mathias.ec3_mathiastrasmonte.data.retrofit

import com.mathias.ec3_mathiastrasmonte.model.Clothe
import retrofit2.http.GET


interface ClotheService {
    @GET("products?limit=35")
    suspend fun getClothes(): List<Clothe>

}