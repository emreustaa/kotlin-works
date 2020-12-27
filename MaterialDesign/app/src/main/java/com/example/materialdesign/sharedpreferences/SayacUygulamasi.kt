package com.example.materialdesign.sharedpreferences

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.materialdesign.databinding.ActivitySayacUygulamasiBinding

class SayacUygulamasi : AppCompatActivity() {
    private lateinit var binding: ActivitySayacUygulamasiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySayacUygulamasiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sp = getSharedPreferences("GirisSayisi", Context.MODE_PRIVATE)
        var sayac = sp.getInt("sayac", 0)
        val editor = sp.edit()
        editor.putInt("sayac", ++sayac)
        editor.commit()

        binding.textViewSayac.text = "Açılış Sayısı : $sayac"
    }
}