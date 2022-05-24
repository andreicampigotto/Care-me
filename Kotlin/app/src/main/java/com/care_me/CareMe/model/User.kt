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
    val icon: String?,
    val fullName: String,
    val birthday: Int?,
    val emergencyPhone: String?,
    val bloodType: String?,
    val height: Float?
)
