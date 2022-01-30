package com.care_me.CareMe.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.care_me.CareMe.R
import com.care_me.CareMe.databinding.ActivityLoginBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ActivityLogin : AppCompatActivity(R.layout.activity_login) {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        openApp()
    }

    private fun openApp(){
        binding.cardEntry.loginIcon.setOnClickListener {
            startActivity(Intent(this, ActivitySplash::class.java))
        }

        binding.cardEntry.loginHi.setOnClickListener{
            startActivity(Intent(this, ActivitySplash::class.java))
        }
    }
}