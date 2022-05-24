package com.care_me.CareMe.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.care_me.CareMe.model.Doctor

@Dao
interface DoctorDAO {

    @Query("SELECT * FROM doctor")
    fun getDoctors(): List<Doctor>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun setDoctor(doctor: Doctor)
}