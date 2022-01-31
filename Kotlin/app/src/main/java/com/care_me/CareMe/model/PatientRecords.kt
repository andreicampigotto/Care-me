package com.care_me.CareMe.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class PatientRecord (
    @PrimaryKey
    @ColumnInfo(name = "idPatientRecord")
    val idPatientRecord: String,
    val user: User,
    val disease: List<Disease>,
    val medicalVisit: List<Date>,
    val appointments: List<Appointments>,
    val allergy: List<Allergy>,
    val drug: List<Drug>
)
