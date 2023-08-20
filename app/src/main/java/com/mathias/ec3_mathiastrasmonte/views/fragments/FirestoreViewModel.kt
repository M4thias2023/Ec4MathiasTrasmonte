package com.mathias.ec3_mathiastrasmonte.views.fragments

import android.app.Application
import android.content.ContentValues.TAG
import android.nfc.Tag
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.mathias.ec3_mathiastrasmonte.model.ClotheFirebase

class FirestoreViewModel(application: Application) : AndroidViewModel(application) {
    private val firestore: FirebaseFirestore = Firebase.firestore
    private val _clothes: MutableLiveData<List<ClotheFirebase>> = MutableLiveData()
    val clothes: LiveData<List<ClotheFirebase>> = _clothes

    fun getFirebaseList() {
        firestore.collection("clothe").get()
            .addOnSuccessListener { result ->
                val clothesList = mutableListOf<ClotheFirebase>()
                for (document in result.documents) {
                    val clotheFirebase = ClotheFirebase(
                        title = document.getString("title") ?: "",
                        price = document.getString("price") ?: "",
                        img = document.getString("img")?: "",
                        description = document.getString("description") ?: ""
                    )
                    clothesList.add(clotheFirebase)
                }
                _clothes.value = clothesList
            }
            .addOnFailureListener { exception ->
                Log.e(TAG, "Error getting documents: ", exception)
            }
    }

}