package com.care_me.CareMe.model

data class User(
    val idUser: String,
    val image: String?,
    val fullName: String,
    val birthday: Int?,
    val phone: String?,
    val emergencyPhone: String?,
    val city: String?,
    val country: String?,
    val bloodType: String?,
    val allergy: List<Allergy>,
    val patientRecord: List<PatientRecord>
)
