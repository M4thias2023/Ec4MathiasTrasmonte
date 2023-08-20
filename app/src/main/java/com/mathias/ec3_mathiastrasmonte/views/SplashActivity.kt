package com.mathias.ec3_mathiastrasmonte.views

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.mathias.ec3_mathiastrasmonte.R
import com.mathias.ec3_mathiastrasmonte.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding
    private lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        sharedPreferences= getSharedPreferences(LoginActivity.SESSION_PREFERENCE, MODE_PRIVATE)
        Handler().postDelayed({
            val email:String = sharedPreferences.getString(LoginActivity.EMAIL,"")?:""
            val intent = if(email.isNotEmpty()){
                Intent(this,MainActivity::class.java)
            }else{
                Intent(this,LoginActivity::class.java)
            }
            startActivity(intent)
            finish()
        },2000)
    }

}