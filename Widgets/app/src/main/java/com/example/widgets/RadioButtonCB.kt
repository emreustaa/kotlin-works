package com.example.widgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.widgets.databinding.ActivityMainBinding
import com.example.widgets.databinding.ActivityRadioButtonCBBinding

class RadioButtonCB : AppCompatActivity() {

    private lateinit var binding: ActivityRadioButtonCBBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRadioButtonCBBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val javaDurum = binding.checkBoxJava.isChecked
        val kotlinDurum = binding.checkBoxKotlin.isChecked
        val barcelonaDurum = binding.radioButtonBarcelone.isChecked
        val realDurum = binding.radioButtonRealMadrid.isChecked


        Log.e("javaDurum", javaDurum.toString())
        Log.e("kotlinDurum", kotlinDurum.toString())
        Log.e("barcelonaDurum", barcelonaDurum.toString())
        Log.e("realDurum", realDurum.toString())

        binding.radioButtonBarcelone.setOnCheckedChangeListener { compoundButton, isChecked ->
            if (isChecked) {
                Toast.makeText(applicationContext, "Barcelona tıklandı..!", Toast.LENGTH_LONG)
                    .show()

            }
        }

        
    }
}