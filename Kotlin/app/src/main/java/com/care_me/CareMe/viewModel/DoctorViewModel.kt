package com.care_me.CareMe.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.care_me.CareMe.model.Doctor
import com.care_me.CareMe.repository.DoctorRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DoctorViewModel @Inject constructor(
    private val repository: DoctorRepository
) : ViewModel() {

    private val _doctorList = MutableLiveData<List<Doctor>>()
    val doctorList: LiveData<List<Doctor>> = _doctorList

    fun getDoctors() {
        viewModelScope.launch {
            _doctorList.value = repository.getDoctors()
        }
    }

    fun setDoctor(doctor: Doctor) {
        viewModelScope.launch {
            repository.setDoctor(doctor)
        }
    }
}