package com.example.fragmentkullanimi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragmetikinci.view.*

class FragmentIkınci : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val rootView = inflater.inflate(R.layout.fragmetikinci, container, false)

        rootView.buttonYap.setOnClickListener {
            rootView.textViewCikti.text = "Merhaba"
        }
        return rootView
    }
}