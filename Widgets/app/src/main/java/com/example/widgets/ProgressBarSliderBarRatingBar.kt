package com.example.widgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.SeekBar
import com.example.widgets.databinding.ActivityProgressBarSliderBarRatingBarBinding

class ProgressBarSliderBarRatingBar : AppCompatActivity() {
    private lateinit var binding: ActivityProgressBarSliderBarRatingBarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityProgressBarSliderBarRatingBarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonBasla.setOnClickListener {
            binding.progressBar.visibility = View.VISIBLE
        }
        binding.buttonDur.setOnClickListener { binding.progressBar.visibility = View.INVISIBLE }


        var gelenIlerleme = binding.seekBarMain.progress
        Log.e("Ilerleme", gelenIlerleme.toString())

        binding.seekBarMain.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                binding.textViewSonuc.text = "Sonuç : $progress"
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }
        })

        val gelenOyalama = binding.ratingBarMain.rating
        Log.e("Oylama Sonucu : ", gelenOyalama.toString())
    }
}