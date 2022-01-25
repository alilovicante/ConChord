package com.example.conchord

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface apiEndPoints {
    @GET("chords")
    fun getChords(@Query("nameLike")name: String):Call<List<ResponseData>>
}