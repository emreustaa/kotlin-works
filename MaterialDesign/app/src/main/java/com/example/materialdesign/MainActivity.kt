package com.example.materialdesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.materialdesign.bottomnavigation.BottomNav
import com.example.materialdesign.databinding.ActivityMainBinding
import com.example.materialdesign.navigationdrawer.Nav_Drawer
import com.example.materialdesign.sharedpreferences.LoginEkrani
import com.example.materialdesign.sharedpreferences.SayacUygulamasi
import com.example.materialdesign.sharedpreferences.SharedP

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.fab.setOnClickListener {
            val intent = Intent(this@MainActivity, LoginEkrani::class.java)
            startActivity(intent)
        }

    }
}