package com.mathias.ec3_mathiastrasmonte.data.repository

import com.mathias.ec3_mathiastrasmonte.data.db.ClotheDao
import com.mathias.ec3_mathiastrasmonte.data.response.ApiResponse
import com.mathias.ec3_mathiastrasmonte.data.retrofit.ServiceInstance
import com.mathias.ec3_mathiastrasmonte.model.Clothe
import java.lang.Exception

class ClotheRepository(val clotheDao: ClotheDao? = null) {

    suspend fun getClothes():ApiResponse<List<Clothe>?>{
        return try{
            val response = ServiceInstance.getClotheService().getClothes()
            ApiResponse.Success(response)
        }catch (e: Exception){
            ApiResponse.Error(e)
        }
    }

    suspend fun addFavorite(clothe: Clothe){
        clotheDao?.let {
            it.addFavorite(clothe)
        }
    }

    suspend fun removeFavorite(clothe: Clothe) {
        clotheDao?.let {
            it.removeFavorite(clothe)
        }
    }

    fun getFavorites(): List<Clothe>{
        clotheDao?.let {
            return it.getFavorites()
        } ?: kotlin.run {
            return listOf()
        }
    }
}