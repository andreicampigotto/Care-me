package com.care_me.CareMe.adapters

import androidx.recyclerview.widget.DiffUtil
import com.care_me.CareMe.model.Appointments

class AppointmentDiffCallback : DiffUtil.ItemCallback<Appointments>() {

    override fun areItemsTheSame(oldItem: Appointments, newItem: Appointments): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Appointments, newItem: Appointments): Boolean {
        return oldItem.idAppointments == newItem.idAppointments
    }
}