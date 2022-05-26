package com.care_me.CareMe.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class Appointment(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "appointment_id")
    val appointment_id: Int = 0,

    @ColumnInfo(name = "appointment")
    val appointment: String,

    @ColumnInfo(name = "weight")
    val weight: Float,

    @ColumnInfo(name = "bloodPressure")
    val bloodPressure: String,

    @ColumnInfo(name = "comments")
    val comments: String?,

    @ColumnInfo(name = "doctor")
    val doctor: String?,

    @ColumnInfo(name = "presentDate")
    val presentDate: String
)


