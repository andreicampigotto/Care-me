package com.care_me.CareMe.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.care_me.CareMe.model.Appointments

@Dao
interface AppointmentDAO {

    @Query("SELECT * FROM appointments")
    fun getAppointments(): List<Appointments>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun setAppointment(appointments: Appointments)
}