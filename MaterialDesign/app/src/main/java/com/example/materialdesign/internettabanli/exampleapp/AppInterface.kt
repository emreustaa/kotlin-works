package com.example.materialdesign.internettabanli.exampleapp

import retrofit2.Call
import retrofit2.http.GET

interface AppInterface {

    @GET("random/trivia?json")
    fun yearResponses(): Call<Years>
}