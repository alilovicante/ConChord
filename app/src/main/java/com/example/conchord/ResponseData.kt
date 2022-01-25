package com.example.conchord

data class ResponseData(
    val strings: String,
    val fingering: String,
    val chordName: String,
    val data: List<ImeAkorda>
)

