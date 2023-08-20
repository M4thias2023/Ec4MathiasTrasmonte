package com.mathias.ec3_mathiastrasmonte.views.fragments

import android.app.Application
import androidx.lifecycle.*
import com.mathias.ec3_mathiastrasmonte.data.db.ClotheDataBase
import com.mathias.ec3_mathiastrasmonte.data.repository.ClotheRepository
import com.mathias.ec3_mathiastrasmonte.model.Clothe
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ClotheFavoriteViewModel(application: Application): AndroidViewModel(application) {

    private val repository: ClotheRepository
    private val _favorites: MutableLiveData<List<Clothe>> = MutableLiveData()
    val favorites: LiveData<List<Clothe>> = _favorites

    init{
        val db= ClotheDataBase.getDataBase(application)
        repository = ClotheRepository(db.ClotheDao())
    }

    fun getFavorites(){
        viewModelScope.launch(Dispatchers.IO) {
            val data = repository.getFavorites()
            _favorites.postValue(data)
        }

    }
}