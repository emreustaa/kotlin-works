package com.example.materialdesign.internettabanli.retrofit

class ApiUtils {

    companion object {

        val BASE_URL = "http://kutuphanemnerede.com/"


        fun getKisilerInterface(): KisilerInterface {


            return RetrofitClient.getClient(BASE_URL).create(KisilerInterface::class.java)
        }
    }
}