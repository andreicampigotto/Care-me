package com.care_me.CareMe.repository

import com.care_me.CareMe.database.dao.AppointmentDAO
import com.care_me.CareMe.model.Appointment
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class AppointmentRepository @Inject constructor(
    private val appointmentDAO: AppointmentDAO
) {

    suspend fun getAppointments(): List<Appointment> = withContext(Dispatchers.Main){
        appointmentDAO.getAppointments()
    }

    suspend fun setAppointment(appointment: Appointment) {
        return withContext(Dispatchers.Main) {
            appointmentDAO.setAppointment(appointment)
        }
    }
}