package com.example.football_schedule_app.model



data class League(val idLeague: String?, val strLeague: String?) {

    override fun toString(): String {

        return strLeague.toString()

    }

}