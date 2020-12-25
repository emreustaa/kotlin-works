package com.example.materialdesign.navigationdrawer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.materialdesign.databinding.NavFragmentBirinciBinding

class NavFragmentBirinci : Fragment() {

    private lateinit var binding: NavFragmentBirinciBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = NavFragmentBirinciBinding.inflate(layoutInflater)
        return binding.root
    }
}