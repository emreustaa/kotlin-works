package com.example.materialdesign.navigationdrawer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.materialdesign.databinding.NavFragmentIkinciBinding
import com.example.materialdesign.databinding.NavFragmentUcuncuBinding

class NavFragmentUcuncu : Fragment() {

    private lateinit var binding: NavFragmentUcuncuBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = NavFragmentUcuncuBinding.inflate(layoutInflater)
        return binding.root
    }
}