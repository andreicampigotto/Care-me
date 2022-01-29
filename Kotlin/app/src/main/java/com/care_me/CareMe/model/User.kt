package com.care_me.CareMe.model

import java.util.*

data class User(
    val image: String?,
    val fullName: String?,
    val birthday: Int?,
    val phone: String?,
    val emergencyPhone: String?,
    val city: String?,
    val country: String?,
    val bloodType: String?
)

data class Drug(
    val drugName: String,
    val continuousUse: Boolean
)

data class allergy(
    val allergyNAme: String?,
    val allergyDescription: String?
        )

data class Appointments(
    val appointment: Date,
    val weight: Float,
    val height: Int,
    val bloodPressure: String,
    val comments: String?,
    val doctor: String?
)