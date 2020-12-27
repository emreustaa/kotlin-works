package com.example.materialdesign.advancedkotlin.services

import android.app.Service
import android.content.Intent
import android.os.Handler
import android.os.IBinder
import android.os.Looper
import android.widget.Toast

class TimerService : Service() {

    private lateinit var handler: Handler
    private val thread = object : Runnable {
        override fun run() {
            Toast.makeText(this@TimerService, "Servis çalışmaya devam ediyor", Toast.LENGTH_SHORT)
                .show()

            this@TimerService.handler.postDelayed(this, 5000)
        }
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onCreate() {
        handler = Handler(Looper.getMainLooper())
        handler.postDelayed(thread, 5000)
        Toast.makeText(this, "Servis çalışmaya başladı", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        handler.removeCallbacks(thread)
        Toast.makeText(this, "Servis durdu", Toast.LENGTH_SHORT).show()
    }
}