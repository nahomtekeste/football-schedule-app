package com.example.football_schedule_app.model


import com.google.gson.annotations.SerializedName
data class MatchSearchResponse(

    @field:SerializedName("event")
    val events: MutableList<Match>
)