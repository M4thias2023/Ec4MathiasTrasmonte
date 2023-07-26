package com.mathias.ec3_mathiastrasmonte.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.mathias.ec3_mathiastrasmonte.R
import com.mathias.ec3_mathiastrasmonte.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val navHostFragment =supportFragmentManager.findFragmentById(R.id.fcv_clothe) as NavHostFragment
        val navController = navHostFragment.navController
        binding.clotheBnv.setupWithNavController(navController);
    }

}