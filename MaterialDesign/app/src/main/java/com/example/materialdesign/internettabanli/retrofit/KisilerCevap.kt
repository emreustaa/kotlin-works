package com.example.materialdesign.internettabanli.retrofit

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class KisilerCevap(
    @SerializedName("kisiler")
    @Expose var kisiler: List<Kisiler>
) {
}