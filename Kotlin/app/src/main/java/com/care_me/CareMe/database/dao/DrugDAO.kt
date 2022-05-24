package com.care_me.CareMe.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.care_me.CareMe.model.Drug

@Dao
interface DrugDAO {

    @Query("SELECT * FROM Drug")
    fun getDrugs(): List<Drug>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun setDrug(drug: Drug)
}