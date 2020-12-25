package com.example.materialdesign.tablayout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

import com.example.materialdesign.databinding.FragmentUcuncuBinding

class FragmentUcuncu : Fragment() {
    private lateinit var binding: FragmentUcuncuBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentUcuncuBinding.inflate(layoutInflater)
        return binding.root
    }
}