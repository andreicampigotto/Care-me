package com.care_me.CareMe.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.care_me.CareMe.model.Disease

@Dao
interface DiseaseDAO {
    @Query("SELECT * FROM disease")
    fun getDiseases(): List<Disease>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun setDisease(appointments: Disease)
}