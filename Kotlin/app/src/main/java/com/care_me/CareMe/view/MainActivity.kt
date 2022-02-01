package com.care_me.CareMe.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.care_me.CareMe.R
import com.care_me.CareMe.databinding.MainActivityBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    lateinit var binding: MainActivityBinding

    fun replaceFrag(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, fragment).commitNow()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        replaceFrag(FragmentInsertAppointments())
//         findViewById<BottomNavigationView>(R.id.bottom_navigation).apply {
//            setOnItemSelectedListener { item ->
//                when (item.itemId) {
//                    R.id.profile -> {
//                        //replaceFrag(DrinkFragment())
//                        true
//                    }
//                    R.id.historic -> {
//                        //replaceFrag(BeerFragment())
//                        true
//                    }
////                    R.id.disease ->{
////
////                    }
//                    else -> false
//                }
//            }
//        }
    }

    override fun onBackPressed() {}
}