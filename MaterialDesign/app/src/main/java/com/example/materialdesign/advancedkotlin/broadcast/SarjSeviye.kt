package com.example.materialdesign.advancedkotlin.broadcast

import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.materialdesign.databinding.ActivitySarjSeviyeBinding

class SarjSeviye : AppCompatActivity() {
    private lateinit var binding: ActivitySarjSeviyeBinding
    private lateinit var sarjSeviyeAlgilama: SarjSeviyeAlgilama
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySarjSeviyeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        sarjSeviyeAlgilama = SarjSeviyeAlgilama()
    }

    //
    override fun onResume() {
        super.onResume()

        val filter = IntentFilter()
        filter.addAction("android.intent.action.BATTERY_LOW")
        registerReceiver(sarjSeviyeAlgilama, filter)
    }

    override fun onStop() {
        super.onStop()

        unregisterReceiver(sarjSeviyeAlgilama)
    }
}