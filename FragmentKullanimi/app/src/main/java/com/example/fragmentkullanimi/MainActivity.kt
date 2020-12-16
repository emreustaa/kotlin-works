package com.example.fragmentkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.fragmentkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.switchMain.setOnCheckedChangeListener { buttonView, status ->
            if (status) {
                Log.e("DURUM", "ON")
            } else {
                Log.e("DURUM", "OFF")
            }
        }

        binding.toggleButtonMain.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                Log.e("Durum", "ON")
            } else {
                Log.e("Durum", "ON")
            }
        }
        val fm = supportFragmentManager
        val ft = fm.beginTransaction()

        ft.add(R.id.fragment_tutucu1, FragmentBirinci())
        ft.add(R.id.fragment_tutucu2, FragmentIkınci())

        ft.commit()
    }
}