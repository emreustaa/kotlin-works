package com.example.materialdesign.internettabanli.exampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.materialdesign.databinding.ActivityRandomFactsBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class RandomFacts : AppCompatActivity() {
    private lateinit var binding: ActivityRandomFactsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRandomFactsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        allYears()

    }

    fun allYears() {

        val ayear = ApiUtils.getAppInterface()

        var call = ayear.yearResponses();
        call.enqueue(object : Callback<Years> {
            override fun onResponse(call: Call<Years>, response: Response<Years>) {
                if (response.code() == 200) {
                    var yearsResponse = response.body()
                    println(yearsResponse!!.text)

                }
            }

            override fun onFailure(call: Call<Years>, t: Throwable) {
            }
        })
    }
}