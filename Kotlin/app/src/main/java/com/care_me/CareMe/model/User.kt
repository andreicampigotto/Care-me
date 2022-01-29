package com.care_me.CareMe.model

data class User(
    val firstName: String,
    val lastName: String,
    val age: Int,
    val weight: Float,
    val height: Int,
    val active: Boolean,
   val bloodPressure: String
)
