package com.care_me.CareMe.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Drug(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "drug_id")
    val drug_id: Int = 0,

    @ColumnInfo(name = "name")
    val name: String?,

    @ColumnInfo(name = "description")
    val description: String?,

    @ColumnInfo(name = "continuous")
    val continuous: Boolean = true
)
