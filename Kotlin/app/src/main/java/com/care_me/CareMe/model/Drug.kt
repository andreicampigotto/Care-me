package com.care_me.CareMe.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Drug(
    @PrimaryKey
    @ColumnInfo(name = "idDrug")
    val idDrug: String,
    val drugName: String?,
    val continuousUse: Boolean
)
