package com.example.flixter

import com.google.gson.annotations.SerializedName

class Movie {
    @JvmField
    @SerializedName("title")
    var title: String? = null

    @JvmField
    @SerializedName("overview")
    var description: String? = null

    @JvmField
    @SerializedName("poster_path")
    var poster_path: String? = null
}