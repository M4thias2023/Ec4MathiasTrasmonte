package com.mathias.ec3_mathiastrasmonte.data.retrofit

import com.mathias.ec3_mathiastrasmonte.data.response.ClotheListResponse
import retrofit2.http.GET

interface ClotheService {
    @GET("4c4f4f66-d543-4d70-811d-9429e23d72aa")
    suspend fun getClothes(): ClotheListResponse
}