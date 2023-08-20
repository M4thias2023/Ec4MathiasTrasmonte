package com.mathias.ec3_mathiastrasmonte.views

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.mathias.ec3_mathiastrasmonte.RVClotheListAdapter
import com.mathias.ec3_mathiastrasmonte.RVClotheListAdapterFirebase
import com.mathias.ec3_mathiastrasmonte.databinding.ActivityFirestoreBinding
import com.mathias.ec3_mathiastrasmonte.model.Clothe
import com.mathias.ec3_mathiastrasmonte.model.ClotheFirebase
import com.mathias.ec3_mathiastrasmonte.model.getData
import com.mathias.ec3_mathiastrasmonte.views.fragments.FirestoreViewModel
import retrofit2.http.Tag

class FirestoreActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFirestoreBinding
    private lateinit var adapter: RVClotheListAdapterFirebase
    private lateinit var viewModel: FirestoreViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirestoreBinding.inflate(layoutInflater)
        adapter = RVClotheListAdapterFirebase(emptyList()) { /* Handle item click here */ }
        viewModel = ViewModelProvider(this).get(FirestoreViewModel::class.java)
        setContentView(binding.root)
        binding.rvClotheList.adapter = adapter
        binding.rvClotheList.layoutManager =
            GridLayoutManager(this,1, RecyclerView.VERTICAL,false)
        viewModel.clothes.observe(this, Observer { clothes ->
            adapter.updateData(clothes)
        })

        viewModel.getFirebaseList()

        binding.fabAddClothe.setOnClickListener {
            val intent = Intent(this,AddClotheActivity::class.java)
            startActivity(intent)
        }
    }



}