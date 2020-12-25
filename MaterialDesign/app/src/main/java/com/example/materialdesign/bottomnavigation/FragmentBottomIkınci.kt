package com.example.materialdesign.bottomnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.materialdesign.databinding.FragmentBirinciBinding
import com.example.materialdesign.databinding.FragmentIkinciBinding

class FragmentBottomIkınci : Fragment() {

    private lateinit var binding: FragmentIkinciBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentIkinciBinding.inflate(layoutInflater)
        return binding.root
    }
}