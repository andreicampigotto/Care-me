package com.care_me.CareMe.model

import java.util.*

data class Appointments(
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

