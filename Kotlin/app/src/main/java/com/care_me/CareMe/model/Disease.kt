package com.care_me.CareMe.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Disease(
    @PrimaryKey
    @ColumnInfo(name = "idDisease")
    val idDisease: String,
    val diseaseName: String?,
    val diseaseDescription: String?,

    )
