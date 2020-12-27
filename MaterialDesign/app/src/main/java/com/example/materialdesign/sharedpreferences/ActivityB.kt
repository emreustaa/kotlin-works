package com.example.materialdesign.sharedpreferences

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.materialdesign.databinding.ActivityBBinding

class ActivityB : AppCompatActivity() {
    private lateinit var binding: ActivityBBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityBBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sp = getSharedPreferences("KisiselBilgiler", Context.MODE_PRIVATE)

        val ad = sp.getString("ad", "isim yok")
        val yas = sp.getInt("yas", 0)
        val boy = sp.getFloat("boy", 0.0f)
        val bekarMi = sp.getBoolean("bekarMi", false)


        val liste = sp.getStringSet("arkadasListesi", null)

        Log.e("Ad", ad!!)
        Log.e("yas", yas.toString())
        Log.e("boy", boy.toString())
        Log.e("bekarMi", bekarMi.toString())

        if (liste != null) {
            for (a in liste) {
                Log.e("Arkadas", a)
            }
        }


    }
}