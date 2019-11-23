package com.example.football_schedule_app.model

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Team(

    val id: Long?,

    val idTeam: String?,

    val strTeamBadge: String?,

    val strTeam: String?,

    val intFormedYear: String?,

    val strStadium: String?,

    val strDescriptionEN: String?) : Parcelable {
    override fun describeContents(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun writeToParcel(p0: Parcel?, p1: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    companion object {
        const val TABLE_TEAMS = "TABLE_TEAMS"
        const val ID = "ID"
        const val ID_TEAM = "ID_TEAM"
        const val TEAM_BADGE = "TEAM_BADGE"
        const val TEAM = "TEAM"
        const val FORMED_YEAR = "FORMED_YEAR"
        const val STADIUM = "STADIUM"
        const val DESCRIPTION = "DESCRIPTION"
    }
}