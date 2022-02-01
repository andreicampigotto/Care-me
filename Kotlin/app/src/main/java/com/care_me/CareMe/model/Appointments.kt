package com.care_me.CareMe.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class Appointments(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "idAppointments")
    val idAppointments: Int,
    val appointment: String,
    val weight: Float,
    val height: Int,
    val bloodPressure: String,
    val comments: String?,
    val doctor: String?,
    val presentDate: String
)


