package com.care_me.CareMe.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.care_me.CareMe.model.Drug
import com.care_me.CareMe.repository.DrugRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DrugViewModel @Inject constructor(private val repository: DrugRepository) :
    ViewModel() {

    private val _drugList = MutableLiveData<List<Drug>>()
    val drugList: LiveData<List<Drug>> = _drugList

    fun getDrug() {
        viewModelScope.launch {
            _drugList.value = repository.getDrugs()
        }
    }

    fun setDrug(drug: Drug) {
        viewModelScope.launch {
            repository.setDrug(drug)
        }
    }
}