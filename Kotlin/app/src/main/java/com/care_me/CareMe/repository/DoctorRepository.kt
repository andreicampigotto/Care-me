package com.care_me.CareMe.repository

import com.care_me.CareMe.database.dao.DoctorDAO
import com.care_me.CareMe.model.Doctor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class DoctorRepository @Inject constructor(
    private val doctorDAO: DoctorDAO
) {
    suspend fun getDoctors(): List<Doctor> = withContext(Dispatchers.Main) {
        doctorDAO.getDoctors()
    }

    suspend fun setDoctor(doctor: Doctor) {
        return withContext(Dispatchers.Main) {
            doctorDAO.setDoctor(doctor)
        }
    }
}