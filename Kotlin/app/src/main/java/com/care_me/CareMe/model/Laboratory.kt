package com.care_me.CareMe.model

data class Laboratory (
    val idLaboratory: String,
    val name: String,
    val drug: List<Drug>
)
