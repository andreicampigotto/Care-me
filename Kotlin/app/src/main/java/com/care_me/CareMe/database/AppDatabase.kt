package com.care_me.CareMe.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.care_me.CareMe.database.dao.AppointmentDAO
import com.care_me.CareMe.model.*

@Database(
    entities = [User::class, Drug::class, Allergy::class, Disease::class, Doctor::class, Appointment::class],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun getAppointmentDAO(): AppointmentDAO

    companion object {
        fun getDatabase(context: Context): AppDatabase {
            return Room.databaseBuilder(
                context.applicationContext,
                AppDatabase::class.java,
                "care_me_db"
            ).allowMainThreadQueries().build()
        }
    }
}