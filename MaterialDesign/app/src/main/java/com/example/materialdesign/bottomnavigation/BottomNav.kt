package com.example.materialdesign.bottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.materialdesign.R
import com.example.materialdesign.databinding.ActivityBottomNavBinding
import com.example.materialdesign.databinding.FragmentUcuncuBinding
import com.example.materialdesign.tablayout.FragmentBirinci
import com.example.materialdesign.tablayout.FragmentIkınci
import com.example.materialdesign.tablayout.FragmentUcuncu

class BottomNav : AppCompatActivity() {

    private lateinit var binding: ActivityBottomNavBinding
    private lateinit var tempFragment: Fragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBottomNavBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().add(R.id.bottomFragmentTutucu, FragmentBirinci())
            .commit()


        binding.bottombar.setOnNavigationItemSelectedListener { menuItem ->

            if (menuItem.itemId == R.id.action_bottom_menu) {
                Toast.makeText(applicationContext, "Menü Tıklandı", Toast.LENGTH_SHORT).show()
                tempFragment = FragmentUcuncu()

            }


            if (menuItem.itemId == R.id.action_bottom_ara) {
                Toast.makeText(applicationContext, "Ara Tıklandı", Toast.LENGTH_SHORT).show()

                tempFragment = FragmentIkınci()
            }


            if (menuItem.itemId == R.id.action_bottom_bilgi) {
                Toast.makeText(applicationContext, "Bilgi Tıklandı", Toast.LENGTH_SHORT).show()

                tempFragment = FragmentBirinci()
            }

            supportFragmentManager.beginTransaction()
                .replace(R.id.bottomFragmentTutucu, tempFragment)
                .commit()

            true
        }
    }
}