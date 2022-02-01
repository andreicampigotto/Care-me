package com.care_me.CareMe.repository

import com.care_me.CareMe.database.dao.AppointmentDAO
import com.care_me.CareMe.model.Appointments
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class AppointmentRepository @Inject constructor(
    private val appointmentDAO: AppointmentDAO
) {

    suspend fun getAppointments(): List<Appointments> = withContext(Dispatchers.Main){
        appointmentDAO.getAppointments()
    }

    suspend fun setAppointment(appointments: Appointments) {
        return withContext(Dispatchers.Main) {
            appointmentDAO.setAppointment(appointments)
        }
    }
}