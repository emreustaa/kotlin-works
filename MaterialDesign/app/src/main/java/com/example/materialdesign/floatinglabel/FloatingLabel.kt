package com.example.materialdesign.floatinglabel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.example.materialdesign.databinding.ActivityFloatingLabelBinding

class FloatingLabel : AppCompatActivity() {

    private lateinit var binding: ActivityFloatingLabelBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFloatingLabelBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonYap.setOnClickListener {

            val ad = binding.editTextAd.text.toString().trim()
            val soyad = binding.editTextTelefon.text.toString().trim()

            if (TextUtils.isEmpty(ad)) {
                Toast.makeText(applicationContext, "ad boş", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            if (TextUtils.isEmpty(soyad)) {
                Toast.makeText(applicationContext, "soyad bos", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            Toast.makeText(applicationContext, "$ad - $soyad", Toast.LENGTH_LONG).show()
        }
    }
}