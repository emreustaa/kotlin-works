package com.example.materialdesign.advancedkotlin.broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Build
import android.telephony.SmsMessage
import android.widget.Toast

class SmsYakalayici : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {

        val b = intent?.extras

        if (b != null) {

            val pdusObject = b.get("pdus") as Array<Any>

            for (i in pdusObject.indices) { // içinde kaç tane eleman varsa onun range'ini veriyor

                val guncelMesaj: SmsMessage

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    val format = b.getString("format")
                    guncelMesaj = SmsMessage.createFromPdu(pdusObject[i] as ByteArray, format)
                } else {
                    guncelMesaj = SmsMessage.createFromPdu(pdusObject[i] as ByteArray)
                }

                val telNo = guncelMesaj.displayOriginatingAddress
                val mesaj = guncelMesaj.displayMessageBody

                Toast.makeText(context, "$telNo - $mesaj ", Toast.LENGTH_SHORT).show()
            }
        }
        Toast.makeText(context, "Sms geldi", Toast.LENGTH_LONG).show()
    }
}