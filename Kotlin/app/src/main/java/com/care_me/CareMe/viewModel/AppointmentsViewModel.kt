package com.care_me.CareMe.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.care_me.CareMe.model.Appointments
import com.care_me.CareMe.repository.AppointmentRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class AppointmentsViewModel @Inject constructor(private val repository: AppointmentRepository) :
    ViewModel() {

    private val _appointmentList = MutableLiveData<List<Appointments>>()
    val appointmentList: LiveData<List<Appointments>> = _appointmentList

    fun getAppointments() {
        viewModelScope.launch {
            _appointmentList.value = repository.getAppointments()
        }
    }

    fun setAppointment(appointments: Appointments) {
        viewModelScope.launch {
            repository.setAppointment(appointments)
        }
    }
}