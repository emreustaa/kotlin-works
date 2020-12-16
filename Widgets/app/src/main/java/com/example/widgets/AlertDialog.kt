package com.example.widgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.widgets.databinding.ActivityAlertDialogBinding
import com.example.widgets.databinding.ActivityMainBinding

class AlertDialog : AppCompatActivity() {
    private lateinit var binding: ActivityAlertDialogBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlertDialogBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonNormal.setOnClickListener {
            val alert = AlertDialog.Builder(this)
            alert.setMessage("Mesaj")
            alert.setTitle("Başlık")
            alert.setIcon(R.drawable.android)

            alert.setPositiveButton("Tamam") { dialogInterace, i ->
                Toast.makeText(applicationContext, "TAMAM TIKLANILDI", Toast.LENGTH_LONG).show()

            }

            alert.setNegativeButton("İptal") { dialogInterace, i ->
                Toast.makeText(applicationContext, "İPTAL TIKLANILDI", Toast.LENGTH_LONG).show()

            }

            alert.create().show()
        }
        binding.buttonOzel.setOnClickListener {
            val tasarim = layoutInflater.inflate(R.layout.alert_tasarim, null)
            val editTextAlert = tasarim.findViewById(R.id.editTextAlert) as EditText
            val alert = AlertDialog.Builder(this)
            alert.setMessage("Mesaj")
            alert.setTitle("Başlık")
            alert.setIcon(R.drawable.android)

            alert.setView(tasarim)
            alert.setPositiveButton("Kaydet") { dialogInterace, i ->
                Toast.makeText(applicationContext, "Kaydet TIKLANILDI", Toast.LENGTH_LONG).show()

            }

            alert.setNegativeButton("İptal") { dialogInterace, i ->
                Toast.makeText(applicationContext, "İPTAL TIKLANILDI", Toast.LENGTH_LONG).show()

            }

            alert.show()
        }
    }
}