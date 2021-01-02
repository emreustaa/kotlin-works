package com.example.materialdesign.internettabanli.exampleapp

class ApiUtils {
    companion object {

        val BASE_URL = "http://numberapi.com/"

        fun getAppInterface():AppInterface{


            return RetrofitClient.getClient(BASE_URL).create(AppInterface::class.java)
        }
    }
}