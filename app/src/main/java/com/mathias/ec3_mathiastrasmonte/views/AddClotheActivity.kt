package com.mathias.ec3_mathiastrasmonte.views

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Toast
import androidx.navigation.findNavController
import com.google.firebase.FirebaseApp
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.mathias.ec3_mathiastrasmonte.databinding.ActivityAddClotheBinding
import com.mathias.ec3_mathiastrasmonte.model.ClotheFirebase
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference
import com.google.firebase.storage.ktx.storage
import com.mathias.ec3_mathiastrasmonte.R
import com.mathias.ec3_mathiastrasmonte.data.db.ClotheDataBase
import com.shashank.sony.fancytoastlib.FancyToast

class AddClotheActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddClotheBinding
    private lateinit var firestore: FirebaseFirestore
    private lateinit var storage: FirebaseStorage
    private var selectedImageUri: Uri? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddClotheBinding.inflate(layoutInflater)
        setContentView(binding.root)
        firestore = Firebase.firestore
        storage = Firebase.storage


        binding.btnAddClothe.setOnClickListener {
            val title: String = binding.tilClotheTittle.editText?.text.toString()
            val price: String = binding.tilClothePrice.editText?.text.toString()
            val img:String = binding.tilImgUrl.editText?.text.toString()
            val description: String = binding.tilClotheDescription.editText?.text.toString()
            if (title.isNotEmpty() && price.isNotEmpty() && description.isNotEmpty()){
                uploadImageAndClotheData(title,price,description)
            }
            cleanTextFields()
        }
        binding.btnSelectImage.setOnClickListener {
            openImageSelector()
        }
    }

    private fun uploadImageAndClotheData(title: String, price: String, description: String) {
        val storageRef = storage.reference
        val imageRef = storageRef.child("images/${selectedImageUri?.lastPathSegment}")

        val uploadTask = imageRef.putFile(selectedImageUri!!)

        uploadTask.addOnSuccessListener {
            // Image uploaded successfully, now you can retrieve its download URL
            imageRef.downloadUrl.addOnSuccessListener { downloadUri ->
                val imgUrl = downloadUri.toString()

                // Now you can save the rest of the clothe data along with the image URL to Firestore
                val clothe = hashMapOf(
                    "title" to title,
                    "price" to price,
                    "img" to imgUrl,
                    "description" to description
                )
                firestore.collection("clothe")
                    .add(clothe)
                    .addOnSuccessListener {
                        FancyToast.makeText(this, "Agregado correctamente con id: ${it.id}", FancyToast.LENGTH_SHORT,FancyToast.SUCCESS,true).show()
                    }
                    .addOnFailureListener {
                        FancyToast.makeText(this,"No se agregó el elemento !",FancyToast.LENGTH_LONG,FancyToast.INFO,true).show()
                    }
            }
        }.addOnFailureListener {
            FancyToast.makeText(this,"Error al subir la imagen !",FancyToast.LENGTH_LONG,FancyToast.ERROR,true).show()
        }
    }

    private fun openImageSelector() {
        val intent = Intent(Intent.ACTION_GET_CONTENT)
        intent.type = "image/*"
        startActivityForResult(intent, IMAGE_PICKER_REQUEST)
    }

    companion object {
        private const val IMAGE_PICKER_REQUEST = 123
    }

    private fun cleanTextFields(){
        // Limpiar los campos después de agregar la prenda
        binding.tilClotheTittle.editText?.setText("")
        binding.tilClothePrice.editText?.setText("")
        binding.tilImgUrl.editText?.setText("")
        binding.tilClotheDescription.editText?.setText("")
        binding.tilClotheTittle.editText?.requestFocus()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == IMAGE_PICKER_REQUEST && resultCode == RESULT_OK) {
            selectedImageUri = data?.data
        }
    }



}