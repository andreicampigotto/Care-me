package com.care_me.CareMe.adapters

import androidx.recyclerview.widget.DiffUtil
import com.care_me.CareMe.model.Appointment

class AppointmentDiffCallback : DiffUtil.ItemCallback<Appointment>() {

    override fun areItemsTheSame(oldItem: Appointment, newItem: Appointment): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Appointment, newItem: Appointment): Boolean {
        return oldItem.idAppointments == newItem.idAppointments
    }
}