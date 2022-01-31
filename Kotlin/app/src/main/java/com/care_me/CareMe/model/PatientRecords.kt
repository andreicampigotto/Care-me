package com.care_me.CareMe.model

import java.util.*

data class PatientRecord (
    val idPatientRecord: String,
    val user: User,
    val disease: List<Disease>,
    val medicalVisit: List<Date>,
    val appointments: List<Appointments>
)
