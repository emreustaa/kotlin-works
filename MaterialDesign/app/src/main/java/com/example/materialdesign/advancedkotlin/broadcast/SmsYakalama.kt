package com.example.materialdesign.advancedkotlin.broadcast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.materialdesign.databinding.ActivitySmsYakalamaBinding

class SmsYakalama : AppCompatActivity() {

    private lateinit var binding: ActivitySmsYakalamaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySmsYakalamaBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}