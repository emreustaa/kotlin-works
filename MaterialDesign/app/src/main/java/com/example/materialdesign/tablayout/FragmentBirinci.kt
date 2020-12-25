package com.example.materialdesign.tablayout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.materialdesign.databinding.FragmentBirinciBinding

class FragmentBirinci:Fragment() {
    private lateinit var binding:FragmentBirinciBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = FragmentBirinciBinding.inflate(layoutInflater)
        return binding.root
    }
}