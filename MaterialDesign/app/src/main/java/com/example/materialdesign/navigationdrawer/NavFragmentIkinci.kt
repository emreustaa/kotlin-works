package com.example.materialdesign.navigationdrawer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.materialdesign.databinding.NavFragmentBirinciBinding
import com.example.materialdesign.databinding.NavFragmentIkinciBinding

class NavFragmentIkinci : Fragment() {

    private lateinit var binding: NavFragmentIkinciBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = NavFragmentIkinciBinding.inflate(layoutInflater)
        return binding.root
    }
}