package com.mathias.ec3_mathiastrasmonte.data.retrofit

import com.mathias.ec3_mathiastrasmonte.data.response.ClotheListResponse
import retrofit2.http.GET

interface ClotheService {
    @GET("0abb32d8-3aca-4251-956d-a53bd95360ad")
    suspend fun getClothes(): ClotheListResponse
}