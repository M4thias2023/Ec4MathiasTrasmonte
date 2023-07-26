package com.mathias.ec3_mathiastrasmonte.data.retrofit

import com.mathias.ec3_mathiastrasmonte.data.response.ClotheListResponse
import com.mathias.ec3_mathiastrasmonte.model.Clothe
import retrofit2.http.GET


interface ClotheService {
    @GET("products?limit=5")
    suspend fun getClothes(): List<Clothe>

}