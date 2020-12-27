package com.example.materialdesign.advancedkotlin.countdowntimer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.example.materialdesign.databinding.ActivityCountDownTimerUygulamasiBinding

class CountDownTimerUygulamasi : AppCompatActivity() {

    private lateinit var binding: ActivityCountDownTimerUygulamasiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCountDownTimerUygulamasiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonBasla.setOnClickListener {

            val sayici = object : CountDownTimer(30000, 1000) {

                override fun onTick(millisUntilFinished: Long) {
                    binding.textViewCikti.text = "Kalan süre: ${millisUntilFinished / 1000} sn"
                }

                override fun onFinish() {
                    binding.textViewCikti.text = "Bitti"
                }
            }

            sayici.start()

        }
    }
}