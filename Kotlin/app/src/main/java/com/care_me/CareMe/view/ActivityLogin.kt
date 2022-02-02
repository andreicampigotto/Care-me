package com.care_me.CareMe.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.care_me.CareMe.R
import com.care_me.CareMe.databinding.ActivityLoginBinding
import com.care_me.CareMe.model.User
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

    private fun openApp() {
        binding.cardEntry.loginIcon.setOnClickListener {
            startActivity(
                Intent(this, MainActivity::class.java)
            )
        }
    }

    fun bind(user: User) {
        binding.cardEntry.loginHi.text = user.fullName
        //binding.cardEntry.loginIcon. = user.fullName
        binding.cardEntry.loginBloodType.text = user.bloodType
        binding.cardEntry.loginEmergencyPhone.text = user.emergencyPhone

    }
}