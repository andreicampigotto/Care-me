package com.care_me.CareMe.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class Appointments(
    @PrimaryKey
    @ColumnInfo(name = "idAppointments")
    val idAppointments: String,
    val appointment: Date,
    val weight: Float,
    val height: Int,
    val bloodPressure: String,
    val comments: String?,
    val doctor: String?,
    private val calendar: Calendar = Calendar.getInstance(),
    val presentDate: Date = calendar.time
)


