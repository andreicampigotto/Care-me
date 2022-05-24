package com.care_me.CareMe.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.care_me.CareMe.model.Disease
import com.care_me.CareMe.repository.DiseaseRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DiseaseViewModel @Inject constructor(private val repository: DiseaseRepository) :
    ViewModel() {

    private val _diseaseList = MutableLiveData<List<Disease>>()
    val diseaseList: LiveData<List<Disease>> = _diseaseList

    fun getDisease() {
        viewModelScope.launch {
            _diseaseList.value = repository.getDiseases()
        }
    }

    fun setDisease(disease: Disease) {
        viewModelScope.launch {
            repository.setDisease(disease)
        }
    }
}