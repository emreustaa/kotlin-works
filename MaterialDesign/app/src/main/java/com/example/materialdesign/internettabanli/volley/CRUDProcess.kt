package com.example.materialdesign.internettabanli.volley

import android.util.Log
import com.android.volley.toolbox.Volley


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.example.materialdesign.databinding.ActivityCRUDProcessBinding

class CRUDProcess : AppCompatActivity() {
    private lateinit var binding: ActivityCRUDProcessBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCRUDProcessBinding.inflate(layoutInflater)
        setContentView(binding.root)

        kisiSil(4)
    }

    fun kisiSil(id: Int) {

        var url = ""

        val istek = object : StringRequest(Method.GET, url, Response.Listener { cevap ->

            Log.e("Silme işlemi cevap", cevap)
        }, Response.ErrorListener { e -> e.printStackTrace() }) {

            override fun getParams(): MutableMap<String, String> {

                val params = HashMap<String, String>()
                params["kisi_id"] = "5"
                return params
            }
        }

        Volley.newRequestQueue(this@CRUDProcess).add(istek)


    }
}