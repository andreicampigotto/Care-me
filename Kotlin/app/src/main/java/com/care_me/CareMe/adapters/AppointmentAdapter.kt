package com.care_me.CareMe.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.care_me.CareMe.R
import com.care_me.CareMe.databinding.CardMedicalAppointmentsBinding
import com.care_me.CareMe.model.Appointment
import com.care_me.CareMe.model.User

class AppointmentAdapter :
    ListAdapter<Appointment, AppointmentViewHolder>(AppointmentDiffCallback()) {
    private val appointmentsList = mutableListOf<Appointment>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppointmentViewHolder {
        LayoutInflater.from(parent.context)
            .inflate(R.layout.card_medical_appointments, parent, false).apply {
                return AppointmentViewHolder(this)
            }
    }

    override fun onBindViewHolder(holder: AppointmentViewHolder, position: Int) {
        getItem(position).let {
            //holder.bind(it)
        }
    }

    fun updateList(appointments: List<Appointment>, users: List<User>) {
        appointmentsList.addAll(appointments)
        submitList(appointmentsList.toMutableList())
    }
}

class AppointmentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val binding: CardMedicalAppointmentsBinding =
        CardMedicalAppointmentsBinding.bind(itemView)

    fun bind(appointment: Appointment, user: User) {
        binding.includeTitle.incCardAppointmentsDate.text = appointment.presentDate
        binding.includeTitle.incCardAppointmentsDoctorValue.text = appointment.doctor
        binding.includeTitle.incCardAppointmentsBloodPressureValue.text = appointment.bloodPressure
        binding.includeTitle.incCardAppointmentsWeightValue.text = appointment.weight.toString()
        binding.includeTitle.incCardAppointmentsHeightValue.text = user.height.toString()
    }
}