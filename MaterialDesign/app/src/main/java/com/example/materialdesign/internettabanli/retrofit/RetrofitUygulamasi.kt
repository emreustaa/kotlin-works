package com.example.materialdesign.internettabanli.retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.materialdesign.databinding.ActivityRetrofitUygulamasiBinding

class RetrofitUygulamasi : AppCompatActivity() {
    private lateinit var binding:ActivityRetrofitUygulamasiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRetrofitUygulamasiBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}