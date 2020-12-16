package com.example.widgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.PopupMenu
import com.example.widgets.databinding.ActivityPopUpMenuBinding

class PopUpMenu : AppCompatActivity() {

    private lateinit var binding: ActivityPopUpMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPopUpMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonPopUp.setOnClickListener {
            val popup = PopupMenu(this, binding.buttonPopUp)

            popup.menuInflater.inflate(R.menu.menu, popup.menu)
            popup.show()
        }
    }
}