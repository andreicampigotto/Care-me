package com.care_me.CareMe.model

import java.util.*

data class PatientRecord (
    val idPatientRecord: String,
    val user: User,
    val allergy: List<Allergy>,
    val medicalVisit: List<Date>
)
