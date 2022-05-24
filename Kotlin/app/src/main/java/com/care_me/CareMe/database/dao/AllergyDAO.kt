package com.care_me.CareMe.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.care_me.CareMe.model.Allergy

@Dao
interface AllergyDAO {

    @Query("SELECT * FROM allergy")
    fun getAllergies(): List<Allergy>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun setAllergy(allergy: Allergy)
}