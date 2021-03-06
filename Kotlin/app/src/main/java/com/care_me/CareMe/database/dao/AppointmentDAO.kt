package com.care_me.CareMe.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.care_me.CareMe.model.Appointment

@Dao
interface AppointmentDAO {

    @Query("SELECT * FROM appointment")
    fun getAppointments(): List<Appointment>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun setAppointment(appointment: Appointment)
}