package com.care_me.CareMe.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.care_me.CareMe.R
import com.care_me.CareMe.databinding.ActivityLoginBinding
import com.care_me.CareMe.viewModel.LoginViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ActivityLogin : AppCompatActivity(R.layout.activity_login) {

    private lateinit var viewModel: LoginViewModel
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        viewModel = ViewModelProvider(this).get(LoginViewModel::class.java)
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