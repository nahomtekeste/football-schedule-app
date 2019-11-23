package com.example.football_schedule_app.api

class ApiRepository {

    fun doRequest(url: String): String {
        return URL(url).readText()
    }
}