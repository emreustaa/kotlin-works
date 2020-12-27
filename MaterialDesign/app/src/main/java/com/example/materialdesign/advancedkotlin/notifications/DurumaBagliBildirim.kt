package com.example.materialdesign.advancedkotlin.notifications

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.NotificationCompat
import com.example.materialdesign.R
import com.example.materialdesign.databinding.ActivityDurumaBagliBildirimBinding

class DurumaBagliBildirim : AppCompatActivity() {
    private lateinit var binding: ActivityDurumaBagliBildirimBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDurumaBagliBildirimBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Bildirimler Android 8.0 (oreo) sürümü öncesi ve sonrasına göre iki farklı şekilde çalışır. Sürüm kontrolü yapılması gerekir.

        binding.buttonBildir.setOnClickListener {

            val builder: NotificationCompat.Builder
            val bildirimYoneticisi =
                getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            val intent = Intent(this@DurumaBagliBildirim, DurumaBagliBildirim::class.java)
            val gidilecekIntent =
                PendingIntent.getActivity(this, 1, intent, PendingIntent.FLAG_UPDATE_CURRENT)

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

                val kanalId = "kanalId"
                val kanalAdi = "kanalAd"
                val kanalTanitim = "kanalTanıtım"
                val kanalOnceligi = NotificationManager.IMPORTANCE_HIGH

                var kanal: NotificationChannel? = bildirimYoneticisi.getNotificationChannel(kanalId)

                if (kanal == null) {
                    kanal = NotificationChannel(kanalId, kanalAdi, kanalOnceligi)
                    kanal.description = kanalTanitim
                    bildirimYoneticisi.createNotificationChannel(kanal)
                }


                builder = NotificationCompat.Builder(this, kanalId)
                builder.setContentTitle("Başlık")
                    .setContentText("İçerik")
                    .setSmallIcon(R.drawable.music)
                    .setContentIntent(gidilecekIntent)
                    .setAutoCancel(true)

            } else {

                builder = NotificationCompat.Builder(this)
                builder.setContentTitle("Başlık")
                    .setContentText("İçerik")
                    .setSmallIcon(R.drawable.music)
                    .setContentIntent(gidilecekIntent)
                    .setAutoCancel(true).priority = Notification.PRIORITY_HIGH
            }

            bildirimYoneticisi.notify(1, builder.build())
        }
    }
}