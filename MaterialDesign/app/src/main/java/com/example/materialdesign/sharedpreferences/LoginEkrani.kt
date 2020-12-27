package com.example.materialdesign.sharedpreferences

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.materialdesign.databinding.ActivityLoginEkraniBinding

class LoginEkrani : AppCompatActivity() {
    private lateinit var binding: ActivityLoginEkraniBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginEkraniBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sp = getSharedPreferences("GirisBilgi", Context.MODE_PRIVATE)

        val ogkullaniciAdi = sp.getString("kullaniciAdi", "kullanıcı adı yok")
        val ogsifre = sp.getString("sifre", "sifre yok")

        if (ogkullaniciAdi == "admin" && ogsifre == "123") {
            startActivity(Intent(this@LoginEkrani, LoginAnaEkran::class.java))
            finish()
        }

        binding.buttonGiris.setOnClickListener {

            val kullaniciAdi = binding.editTextKullaniciAdi.text.toString()
            val sifre = binding.editTextSifre.text.toString()

            if (kullaniciAdi == "admin" && sifre == "123") {

                val editor = sp.edit()
                editor.putString("kullaniciAdi", kullaniciAdi)
                editor.putString("sifre", sifre)
                editor.commit()

                startActivity(Intent(this@LoginEkrani, LoginAnaEkran::class.java))
                finish()
            } else {
                Toast.makeText(applicationContext, "Hatalı giriş", Toast.LENGTH_SHORT).show()
            }

        }
    }
}