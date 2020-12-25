package com.example.materialdesign.toolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.materialdesign.R
import com.example.materialdesign.databinding.ActivityToolbarKullanimiBinding

class ToolbarKullanimi : AppCompatActivity() {

    private lateinit var binding: ActivityToolbarKullanimiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityToolbarKullanimiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbar.title = "Uygulama Adı"
        //binding.toolbar.setSubtitle("Uygulama İçeriği")
        binding.toolbar.setLogo(R.drawable.menu)
        binding.toolbar.setTitleTextColor(resources.getColor(R.color.white))


        setSupportActionBar(binding.toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.action_bilgi -> {
                Toast.makeText(applicationContext, "Bilgiye tıklandı", Toast.LENGTH_SHORT).show()

                return true
            }

            R.id.action_ayarlar -> {
                Toast.makeText(applicationContext, "Ayarlar tıklandı", Toast.LENGTH_SHORT).show()

                return true
            }

            R.id.action_cikis -> {
                Toast.makeText(applicationContext, "Cikis tıklandı", Toast.LENGTH_SHORT).show()

                return true
            }

            R.id.action_ekle -> {
                Toast.makeText(applicationContext, "Ekle tıklandı", Toast.LENGTH_SHORT).show()

                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }

    }
}