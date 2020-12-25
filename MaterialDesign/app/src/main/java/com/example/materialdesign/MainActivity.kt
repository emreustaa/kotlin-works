package com.example.materialdesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.materialdesign.bottomnavigation.BottomNav
import com.example.materialdesign.databinding.ActivityMainBinding
import com.example.materialdesign.navigationdrawer.Nav_Drawer

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.fab.setOnClickListener {
            val intent = Intent(this@MainActivity, Nav_Drawer::class.java)
            startActivity(intent)
        }

    }
}