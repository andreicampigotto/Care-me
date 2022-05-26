package com.care_me.CareMe.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "user_id")
    val user_id: Int = 0,

    @ColumnInfo(name = "image")
    val image: String?,

    @ColumnInfo(name = "icon")
    val icon: String?,

    @ColumnInfo(name = "fullName")
    val fullName: String,

    @ColumnInfo(name = "birthday")
    val birthday: Int?,

    @ColumnInfo(name = "emergencyPhone")
    val emergencyPhone: String?,

    @ColumnInfo(name = "bloodType")
    val bloodType: String?,

    @ColumnInfo(name = "height")
    val height: Float?
)
