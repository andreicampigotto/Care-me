package com.care_me.CareMe.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.care_me.CareMe.model.Allergy
import com.care_me.CareMe.repository.AllergyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AllergyViewModel @Inject constructor(private val repository: AllergyRepository) :
    ViewModel() {

    private val _allergyList = MutableLiveData<List<Allergy>>()
    val allergyList: LiveData<List<Allergy>> = _allergyList

    fun getAllergies() {
        viewModelScope.launch {
            _allergyList.value = repository.getAllergies()
        }
    }

    fun setAllergy(allergy: Allergy) {
        viewModelScope.launch {
            repository.setAllergy(allergy)
        }
    }
}