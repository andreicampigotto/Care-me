package com.care_me.CareMe.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Allergy(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "allergy_id")
    val allergy_id: Int = 0,

    @ColumnInfo(name = "name")
    val name: String?,

    @ColumnInfo(name = "description")
    val description: String?
)
