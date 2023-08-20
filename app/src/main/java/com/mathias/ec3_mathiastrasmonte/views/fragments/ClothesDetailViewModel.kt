package com.mathias.ec3_mathiastrasmonte.views.fragments

import android.app.Application
import androidx.lifecycle.*
import com.mathias.ec3_mathiastrasmonte.data.db.ClotheDataBase
import com.mathias.ec3_mathiastrasmonte.data.repository.ClotheRepository
import com.mathias.ec3_mathiastrasmonte.model.Clothe
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ClothesDetailViewModel(application: Application): AndroidViewModel(application){

    private val repository: ClotheRepository

    init{
        val db= ClotheDataBase.getDataBase(application)
        repository = ClotheRepository(db.ClotheDao())
    }

    fun addFavorites(clothe: Clothe){
        viewModelScope.launch(Dispatchers.IO) {
            repository.addFavorite(clothe)
        }
    }

    fun removeFavorite(clothe: Clothe) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.removeFavorite(clothe)
        }
    }
}