package com.example.widgets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.widgets.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonIlerle.setOnClickListener {
            val intent = Intent(this@MainActivity, SnackBart::class.java)
            startActivity(intent)
        }

        binding.switchMain.setOnCheckedChangeListener { buttonView, status ->
            if (status) {
                Log.e("DURUM", "ON")
            } else {
                Log.e("DURUM", "OFF")
            }
        }

        binding.toggleButtonMain.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                Log.e("Durum", "ON")
            } else {
                Log.e("Durum", "OFF")
            }
        }
    }
}