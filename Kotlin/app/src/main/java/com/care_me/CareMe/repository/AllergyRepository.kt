package com.care_me.CareMe.repository

import com.care_me.CareMe.database.dao.AllergyDAO
import com.care_me.CareMe.model.Allergy
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class AllergyRepository @Inject constructor(
    private val allergyDAO: AllergyDAO
) {
    suspend fun getAllergies(): List<Allergy> = withContext(Dispatchers.Main) {
        allergyDAO.getAllergies()
    }

    suspend fun setAllergy(allergy: Allergy) {
        return withContext(Dispatchers.Main) {
            allergyDAO.setAllergy(allergy)
        }
    }
}