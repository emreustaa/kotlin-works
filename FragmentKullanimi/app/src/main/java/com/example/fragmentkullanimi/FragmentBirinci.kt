package com.example.fragmentkullanimi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.fragmentkullanimi.databinding.FragmentbirinciBinding
import kotlinx.android.synthetic.main.fragmentbirinci.view.*

class FragmentBirinci : Fragment() {

    //private lateinit var binding: FragmentbirinciBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val rootView = inflater.inflate(R.layout.fragmentbirinci, container, false)


        //binding = FragmentbirinciBinding.inflate(inflater)
        rootView.buttonTikla.setOnClickListener {
            Toast.makeText(activity, "Merhaba", Toast.LENGTH_SHORT).show()
        }
        return rootView
    }
}