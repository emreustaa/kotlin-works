package com.example.materialdesign.internettabanli.exampleapp

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Years(
    @SerializedName("text") @Expose() var text: String,
    @SerializedName("number") @Expose() var number: Int,
    @SerializedName("found") @Expose() var found: Boolean,
    @SerializedName("type") @Expose() var type: String
) {

}
