package com.example.materialdesign.navigationdrawer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import com.example.materialdesign.R
import com.example.materialdesign.databinding.ActivityNavDrawerBinding
import com.example.materialdesign.tablayout.FragmentBirinci
import com.example.materialdesign.tablayout.FragmentIkınci
import com.example.materialdesign.tablayout.FragmentUcuncu

class Nav_Drawer : AppCompatActivity() {
    private lateinit var binding: ActivityNavDrawerBinding
    private lateinit var fragment: Fragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNavDrawerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbarNavDrawer.title = "Navigation Drawer"
        setSupportActionBar(binding.toolbarNavDrawer)

        val toggle = ActionBarDrawerToggle(this, binding.drawer, binding.toolbarNavDrawer, 0, 0)
        binding.drawer.addDrawerListener(toggle)
        toggle.syncState()


        fragment = FragmentBirinci()

        supportFragmentManager.beginTransaction().replace(R.id.navFragmentTutucu, fragment).commit()

        binding.navigationView.setNavigationItemSelectedListener { menuItem ->

            if (menuItem.itemId == R.id.nav_item_birinci) {
                Toast.makeText(this, "Birinci", Toast.LENGTH_SHORT).show()
                fragment = FragmentBirinci()
            }

            if (menuItem.itemId == R.id.nav_item_ikinci) {
                Toast.makeText(this, "İkinci", Toast.LENGTH_SHORT).show()
                fragment = FragmentIkınci()
            }

            if (menuItem.itemId == R.id.nav_item_ucuncu) {
                Toast.makeText(this, "Üçüncü", Toast.LENGTH_SHORT).show()
                fragment = FragmentUcuncu()
            }

            supportFragmentManager.beginTransaction().replace(R.id.navFragmentTutucu, fragment)
                .commit()

            binding.drawer.closeDrawer(GravityCompat.START) // MENÜ İTEM SEÇİLDİKTEN SONRA NAVIGATION VIEW KAPATILMASINI SAĞLAR
            true
        }
    }

    override fun onBackPressed() {
        if (binding.drawer.isDrawerOpen(GravityCompat.START)) {
            binding.drawer.closeDrawer(GravityCompat.START)
        } else {
            val intent = Intent(Intent.ACTION_MAIN) // ana intent olacak
            intent.addCategory(Intent.CATEGORY_HOME) // ana ekrana dönücez -> home ekranı
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK // yeni bir görev başlatacak
            startActivity(intent)
        }
    }


}