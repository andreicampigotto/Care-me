package com.care_me.CareMe.repository

import com.care_me.CareMe.database.dao.DrugDAO
import com.care_me.CareMe.model.Drug
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class DrugRepository @Inject constructor(
    private val drugDAO: DrugDAO
) {
    suspend fun getDrugs(): List<Drug> = withContext(Dispatchers.Main) {
        drugDAO.getDrugs()
    }

    suspend fun setDrug(drug: Drug) {
        return withContext(Dispatchers.Main) {
            drugDAO.setDrug(drug)
        }
    }
}