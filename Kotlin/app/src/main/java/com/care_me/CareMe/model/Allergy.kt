package com.care_me.CareMe.model

data class Allergy(
    val idAllergy: String,
    val allergyName: String?,
    val allergyDescription: String?,
    val drug: List<Drug>
)
