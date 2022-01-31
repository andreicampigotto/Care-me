package com.care_me.CareMe.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @PrimaryKey
    @ColumnInfo(name = "idUser")
    val idUser: String,
    val image: String?,
    val fullName: String,
    val birthday: Int?,
    val phone: String?,
    val emergencyPhone: String?,
    val city: String?,
    val country: String?,
    val bloodType: String?
)
