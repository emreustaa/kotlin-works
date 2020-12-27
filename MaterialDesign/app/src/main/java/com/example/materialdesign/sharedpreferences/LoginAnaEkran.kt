package com.example.materialdesign.sharedpreferences

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.materialdesign.databinding.ActivityLoginAnaEkranBinding
import com.example.materialdesign.databinding.ActivityLoginEkraniBinding

class LoginAnaEkran : AppCompatActivity() {
    private lateinit var binding: ActivityLoginAnaEkranBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginAnaEkranBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sp = getSharedPreferences("GirisBilgi", Context.MODE_PRIVATE)

        val kullaniciAdi = sp.getString("kullaniciAdi", "kullanıcı adı yok")
        val sifre = sp.getString("sifre", "sifre yok")

        binding.textViewKullaniciAdi.text = "Kullanıcı adı: $kullaniciAdi Sifre: $sifre"
        binding.buttonCikisYap.setOnClickListener {

            val editor = sp.edit()
            editor.remove("kullaniciAdi")
            editor.remove("sifre")
            editor.commit()
            startActivity(Intent(this@LoginAnaEkran, LoginEkrani::class.java))
            finish()
        }
    }
}