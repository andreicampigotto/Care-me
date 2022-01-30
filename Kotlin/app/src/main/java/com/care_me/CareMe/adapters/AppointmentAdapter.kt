package com.care_me.CareMe.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.care_me.CareMe.R
import com.care_me.CareMe.databinding.CardMedicalAppointmentsBinding
import com.care_me.CareMe.model.Appointments

class AppointmentAdapter :
    ListAdapter<Appointments, RecyclerView.ViewHolder>(AppointmentDiffCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        LayoutInflater.from(parent.context)
            .inflate(R.layout.card_medical_appointments, parent, false).apply {
                return AppointmentViewHolder(this)
            }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        getItem(position).let { appointment ->
            //holder.bind(appointment)
        }

    }
}

class AppointmentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val binding: CardMedicalAppointmentsBinding = CardMedicalAppointmentsBinding.bind(itemView)

    fun bind(appointments: Appointments) {
        binding.cardMedicalAppointmentsDate.text = appointments.presentDate.toString()
        binding.cardMedicalAppointmentsHeightLabel.text = appointments.bloodPressure
        binding.cardMedicalAppointmentsHeightValue.text = appointments.height.toString()
        binding.cardMedicalAppointmentsWeightValue.text = appointments.weight.toString()
        binding.c
    }
}