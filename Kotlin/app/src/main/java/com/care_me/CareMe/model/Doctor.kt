package com.care_me.CareMe.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Doctor(
    @PrimaryKey
    @ColumnInfo(name = "idAllergy")
    val idDoctor: String,
    val doctorName: String?,
    val doctorSpeciality: String?,
)