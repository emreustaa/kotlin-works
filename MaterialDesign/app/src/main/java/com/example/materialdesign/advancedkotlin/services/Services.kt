package com.example.materialdesign.advancedkotlin.services

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.materialdesign.databinding.ActivityServicesBinding

class Services : AppCompatActivity() {
    private lateinit var binding: ActivityServicesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityServicesBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonBasla.setOnClickListener {
            startService(Intent(this@Services,TimerService::class.java))
        }

        binding.buttonBitir.setOnClickListener {
            stopService(Intent(this@Services,TimerService::class.java))
        }
    }
}