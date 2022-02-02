package com.care_me.CareMe.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Laboratory (
    @PrimaryKey
    @ColumnInfo(name = "idLaboratory")
    val idLaboratory: String,
    val name: String,
    val drug: List<Drug>
)
