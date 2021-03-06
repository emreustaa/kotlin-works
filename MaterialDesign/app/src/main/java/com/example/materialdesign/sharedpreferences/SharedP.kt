package com.example.materialdesign.sharedpreferences

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.materialdesign.databinding.ActivitySharedPBinding

class SharedP : AppCompatActivity() {
    private lateinit var binding: ActivitySharedPBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySharedPBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sp = getSharedPreferences("KisiselBilgiler", Context.MODE_PRIVATE)
        val editor = sp.edit()

        editor.remove("ad")
        editor.commit()

        /*
        SHARED PREFERENCES KAYIT İŞLEMİ

        editor.putString("ad", "Ahmet")
        editor.putInt("yas", 18)
        editor.putFloat("boy", 1.78f)
        editor.putBoolean("bekarMi", true)

        val arkadasListesi = HashSet<String>()
        arkadasListesi.add("Emre")
        arkadasListesi.add("Arda")
        arkadasListesi.add("Tuğfe")
        arkadasListesi.add("Hümeyra")
        arkadasListesi.add("Zehra")

        editor.putStringSet("arkadasListesi", arkadasListesi)

        editor.commit()
*/
        binding.buttonGit.setOnClickListener {
            startActivity(Intent(this@SharedP, ActivityB::class.java))
        }
    }
}