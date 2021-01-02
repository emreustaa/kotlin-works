package com.example.materialdesign.internettabanli.jsonparse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.materialdesign.databinding.ActivityJSonParseBinding
import org.json.JSONException
import org.json.JSONObject

class JSonParse : AppCompatActivity() {
    private lateinit var binding: ActivityJSonParseBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityJSonParseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val jsonBayraklarSonuc =
            "{\"bayraklar\":[{\"bayrak_id\":\"1\",\"bayrak_ad\":\"T\\u00fcrkiye\",\"bayrak_resim\":\"turkiye\"},{\"bayrak_id\":\"2\",\"bayrak_ad\":\"Almanya\",\"bayrak_resim\":\"almanya\"},{\"bayrak_id\":\"3\",\"bayrak_ad\":\"\\u0130talya\",\"bayrak_resim\":\"italya\"},{\"bayrak_id\":\"4\",\"bayrak_ad\":\"Fransa\",\"bayrak_resim\":\"fransa\"},{\"bayrak_id\":\"5\",\"bayrak_ad\":\"Hollanda\",\"bayrak_resim\":\"hollanda\"},{\"bayrak_id\":\"6\",\"bayrak_ad\":\"\\u0130spanya\",\"bayrak_resim\":\"ispanya\"},{\"bayrak_id\":\"7\",\"bayrak_ad\":\"Slovenya\",\"bayrak_resim\":\"slovenya\"},{\"bayrak_id\":\"8\",\"bayrak_ad\":\"Slovakya\",\"bayrak_resim\":\"slovakya\"},{\"bayrak_id\":\"9\",\"bayrak_ad\":\"Estonya\",\"bayrak_resim\":\"estonya\"},{\"bayrak_id\":\"10\",\"bayrak_ad\":\"Rusya\",\"bayrak_resim\":\"rusya\"},{\"bayrak_id\":\"11\",\"bayrak_ad\":\"Bulgaristan\",\"bayrak_resim\":\"bulgaristan\"},{\"bayrak_id\":\"12\",\"bayrak_ad\":\"Romanya\",\"bayrak_resim\":\"romanya\"},{\"bayrak_id\":\"13\",\"bayrak_ad\":\"Norve\\u00e7\",\"bayrak_resim\":\"norvec\"},{\"bayrak_id\":\"14\",\"bayrak_ad\":\"Yunanistan\",\"bayrak_resim\":\"yunanistan\"},{\"bayrak_id\":\"15\",\"bayrak_ad\":\"Bosna Hersek\",\"bayrak_resim\":\"bosnahersek\"}],\"success\":1}"
        try {


            val jsonObject = JSONObject(jsonBayraklarSonuc)
            val bayraklarListe = jsonObject.getJSONArray("bayraklar")
            for (i in 0 until bayraklarListe.length()) {


                val b = bayraklarListe.getJSONObject(i)
                val bayrak_id = b.getInt("bayrak_id")
                val bayrak_ad = b.getString("bayrak_ad")
                val bayrak_resim = b.getString("bayrak_resim")


                Log.e("**********************", "***********************")
                Log.e("bayrak_id", bayrak_id.toString())
                Log.e("bayrak_ad", bayrak_ad.toString())
                Log.e("bayrak_resim", bayrak_resim.toString())

                Log.e("**********************", "***********************")
            }

        } catch (e: JSONException) {
            e.printStackTrace()
        }
    }
}