package com.example.football_schedule_app.model

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parceler

import kotlinx.android.parcel.Parcelize



@Parcelize data class Player(

    val strCutout: String?,

    val strPlayer: String?,

    val strPosition: String?,

    val strWeight: String?,

    val strHeight: String?,

    val strDescriptionEN: String?,

    val strFanart1: String?) : Parcelable {
    override fun writeToParcel(p0: Parcel?, p1: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun describeContents(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    companion object : Parceler<Player> {

        override fun create(parcel: Parcel): Player = TODO()
        override fun Player.write(p0: Parcel, p1: Int) {
           TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
       }
    }
}