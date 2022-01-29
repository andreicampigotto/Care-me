package com.care_me.CareMe.model

import java.util.*

data class Appointments(
    val appointment: Date,
    val weight: Float,
    val height: Int,
    val bloodPressure: String,
    val comments: String?,
    val doctor: String?
)
