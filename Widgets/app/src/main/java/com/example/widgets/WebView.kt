package com.example.widgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.widgets.databinding.ActivityRadioButtonCBBinding
import com.example.widgets.databinding.ActivityWebViewBinding

class WebView : AppCompatActivity() {

    private lateinit var binding: ActivityWebViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWebViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.webView.loadUrl("https://gelecegiyazanlar.turkcell.com.tr")
    }
}