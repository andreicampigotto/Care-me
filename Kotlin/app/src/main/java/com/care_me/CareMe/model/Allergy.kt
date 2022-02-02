package com.care_me.CareMe.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Allergy(
    @PrimaryKey
    @ColumnInfo(name = "idAllergy")
    val idAllergy: String,
    val allergyName: String?,
    val allergyDescription: String?
)
