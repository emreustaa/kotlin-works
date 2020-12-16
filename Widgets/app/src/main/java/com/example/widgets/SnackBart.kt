package com.example.widgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.widgets.databinding.ActivitySnackBartBinding
import com.google.android.material.snackbar.Snackbar

class SnackBart : AppCompatActivity() {
    private lateinit var binding: ActivitySnackBartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySnackBartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonNormal.setOnClickListener { view ->

            Snackbar.make(view, "Mesaj Merhaba", Snackbar.LENGTH_LONG).show()
        }


        binding.buttonGeriDonus.setOnClickListener { x ->
            Snackbar.make(x, "Mesaj Silinsin mi?", Snackbar.LENGTH_SHORT).setAction("EVET") { y ->
                Snackbar.make(y, "Mesaj Merhaba", Snackbar.LENGTH_LONG).show()
            }.show()
        }


        binding.buttonOzel.setOnClickListener {z->
            
        }
    }
}