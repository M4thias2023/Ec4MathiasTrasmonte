package com.mathias.ec3_mathiastrasmonte.views.fragments

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mathias.ec3_mathiastrasmonte.data.repository.ClotheRepository
import com.mathias.ec3_mathiastrasmonte.data.response.ApiResponse
import com.mathias.ec3_mathiastrasmonte.model.Clothe
import com.mathias.ec3_mathiastrasmonte.model.getData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class ClothesListViewModel : ViewModel() {
    val repository = ClotheRepository()
    val clotheList: MutableLiveData<List<Clothe>> = MutableLiveData<List<Clothe>>()

    fun getClothesList(){
        val data = getData()
        clotheList.value = data
    }


    fun getClothesFromService(){
        viewModelScope.launch(Dispatchers.IO){
            val response = repository.getClothes()
            when(response){
                is ApiResponse.Error ->{}
                is ApiResponse.Success ->{
                    clotheList.postValue(response.data.clothes)
                }
            }
        }
    }

}