package com.care_me.CareMe.model

import java.util.*

data class User(
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

private val calendar = Calendar.getInstance()
private val presentDate = calendar.time
