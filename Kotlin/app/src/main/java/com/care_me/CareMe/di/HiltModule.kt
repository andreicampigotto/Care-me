package com.care_me.CareMe.di

import android.content.Context
import com.care_me.CareMe.database.AppDatabase
import com.care_me.CareMe.database.dao.AppointmentDAO
import com.care_me.CareMe.repository.AppointmentRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
private object HiltModule {

    @Provides
    fun getAppointmentDao(@ApplicationContext context: Context): AppointmentDAO {
        return AppDatabase.getDatabase(context).getAppointmentDAO()
    }

    @Provides
    fun getAppointmentRepository(appointmentDAO: AppointmentDAO) =
        AppointmentRepository(appointmentDAO)

}