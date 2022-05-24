package com.care_me.CareMe.repository

import com.care_me.CareMe.database.dao.DiseaseDAO
import com.care_me.CareMe.model.Disease
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class DiseaseRepository @Inject constructor(
    private val diseaseDAO: DiseaseDAO
) {
    suspend fun getDiseases(): List<Disease> = withContext(Dispatchers.Main) {
        diseaseDAO.getDiseases()
    }

    suspend fun setDisease(disease: Disease) {
        return withContext(Dispatchers.Main) {
            diseaseDAO.setDisease(disease)
        }
    }
}