package com.care_me.CareMe.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.care_me.CareMe.model.*

@Database(
    entities = [User::class, Drug::class, Allergy::class, Disease::class, Doctor::class, Appointments::class ],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {

    companion object {
        fun getDatabase(context: Context): AppDatabase {
            return Room.databaseBuilder(
                context,
                AppDatabase::class.java,
                "care_me_db"
            )
                .fallbackToDestructiveMigration()
                .build()
        }
    }
}