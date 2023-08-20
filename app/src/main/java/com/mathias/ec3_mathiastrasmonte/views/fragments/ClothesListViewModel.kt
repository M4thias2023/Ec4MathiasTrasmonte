package com.mathias.ec3_mathiastrasmonte.views.fragments

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mathias.ec3_mathiastrasmonte.data.repository.ClotheRepository
import com.mathias.ec3_mathiastrasmonte.data.response.ApiResponse
import com.mathias.ec3_mathiastrasmonte.model.Clothe
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch



class ClothesListViewModel : ViewModel() {

    private val repository: ClotheRepository = ClotheRepository()

    // Define MutableLiveData to hold the list of clothes
    private val _clothesList = MutableLiveData<List<Clothe>?>()

    // Expose LiveData to the Fragment for observing
    val clothesList: LiveData<List<Clothe>?>
        get() = _clothesList

    // Function to fetch clothes from the API and update the LiveData
    fun getClothesFromService() {
        GlobalScope.launch(Dispatchers.IO) {
            when (val response = repository.getClothes()) {
                is ApiResponse.Success -> {
                    _clothesList.postValue(response.data)
                }
                is ApiResponse.Error -> {
                    // Handle error if needed
                }
            }
        }
    }
}