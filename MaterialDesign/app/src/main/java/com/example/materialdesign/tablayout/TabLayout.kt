package com.example.materialdesign.tablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.materialdesign.R
import com.example.materialdesign.databinding.ActivityTabLayoutBinding
import com.google.android.material.tabs.TabLayoutMediator

class TabLayout : AppCompatActivity() {
    private lateinit var binding: ActivityTabLayoutBinding
    private val fragmentListesi = ArrayList<Fragment>()
    private val fragmentBaslikListesi = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTabLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fragmentListesi.add(FragmentBirinci())
        fragmentListesi.add(FragmentIkınci())
        fragmentListesi.add(FragmentUcuncu())

        fragmentBaslikListesi.add("Bir")
        fragmentBaslikListesi.add("İki")
        fragmentBaslikListesi.add("Uc")
        val adapter = MyViewPagerAdapter(this)
        binding.viewPager2.adapter = adapter

        TabLayoutMediator(binding.tabLayout, binding.viewPager2) { tab, position ->

            tab.text = fragmentBaslikListesi[position]
        }.attach()

        binding.tabLayout.getTabAt(0)!!.setIcon(R.drawable.music)
        binding.tabLayout.getTabAt(1)!!.setIcon(R.drawable.music)
        binding.tabLayout.getTabAt(2)!!.setIcon(R.drawable.music)


    }

    inner class MyViewPagerAdapter(fragmentActivity: FragmentActivity) :
        FragmentStateAdapter(fragmentActivity) {
        override fun getItemCount(): Int {

            return fragmentListesi.size
        }

        override fun createFragment(position: Int): Fragment {
            return fragmentListesi[position]
        }

    }
}