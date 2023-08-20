package com.mathias.ec3_mathiastrasmonte.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.mathias.ec3_mathiastrasmonte.databinding.ActivityAddClotheBinding
import com.mathias.ec3_mathiastrasmonte.model.ClotheFirebase

class AddClotheActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddClotheBinding
    private lateinit var firestore: FirebaseFirestore
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddClotheBinding.inflate(layoutInflater)
        setContentView(binding.root)
        firestore = Firebase.firestore


        binding.btnAddClothe.setOnClickListener {
            val title: String = binding.tilClotheTittle.editText?.text.toString()
            val price: String = binding.tilClothePrice.editText?.text.toString()
            val img:String = binding.tilImgUrl.editText?.text.toString()
            val description: String = binding.tilClotheDescription.editText?.text.toString()
            if (title.isNotEmpty() && price.isNotEmpty() && description.isNotEmpty()){
                val clothe = hashMapOf(
                    "title" to title,
                    "price" to price,
                    "img" to img,
                    "description" to description
                )
                firestore.collection("clothe")
                    .add(clothe)
                    .addOnSuccessListener{
                        Toast.makeText(this,"Agregado correctamente con id: ${it.id}",Toast.LENGTH_SHORT).show()
                    }
                    .addOnFailureListener {
                        Toast.makeText(this,"No se agregó el elemento",Toast.LENGTH_SHORT).show()
                    }
            }
        }
    }

    private fun getFirebaseList(){
        firestore.collection("clothe").get()
            .addOnSuccessListener {
                val clothes = mutableListOf<ClotheFirebase>()
                for(document in it.documents){
                    val clothe = ClotheFirebase(
                        title = document.data?.get("title").toString(),
                        price = document.data?.get("price").toString(),
                        img = document.data?.get("img").toString(),
                        description = document.data?.get("description").toString(),
                    )
                    clothes.add(clothe)
                }
            }
    }
}