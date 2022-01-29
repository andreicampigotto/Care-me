package com.care_me.CareMe.model

data class PatientRecord (
    val user: User,
    val allergy: List<Allergy>,
    val medicalVisit: List<String>
)
