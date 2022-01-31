package com.care_me.CareMe.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.care_me.CareMe.R
import com.care_me.CareMe.databinding.FragmentRegisterMedicalAppointmentBinding
import com.care_me.CareMe.model.Appointments
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FragmentInsertAppointments : Fragment(R.layout.fragment_register_medical_appointment) {

    private lateinit var binding: FragmentRegisterMedicalAppointmentBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentRegisterMedicalAppointmentBinding.bind(view)

    }

    private fun setValueToFields(appointments: Appointments) {
        binding.fragmentRegisterMedicalAppointmentsDoctor.editText?.setText(appointments.doctor)
        binding.fragmentRegisterMedicalAppointmentsBloodPressure.editText?.setText(appointments.bloodPressure)
        binding.fragmentRegisterMedicalAppointmentsComments.editText?.setText(appointments.comments)
        binding.fragmentRegisterMedicalAppointmentsHeight.editText?.setText(appointments.height)
        binding.fragmentRegisterMedicalAppointmentsWeight.editText?.setText(appointments.weight.toString())
    }

    private fun settingForm() {
        binding.fragmentRegisterMedicalAppointmentsButtonSave.setOnClickListener {
            val doctor = binding.fragmentRegisterMedicalAppointmentsDoctor.editText
            val bloodPressure = binding.fragmentRegisterMedicalAppointmentsBloodPressure.editText
            val comments = binding.fragmentRegisterMedicalAppointmentsComments.editText
            val height = binding.fragmentRegisterMedicalAppointmentsHeight.editText
            val weight = binding.fragmentRegisterMedicalAppointmentsWeight.editText

            if (doctor?.text?.isNotEmpty()!! && bloodPressure?.text.toString()
                    .isNotEmpty()!! && comments?.text.toString()!!.isNotEmpty() && height?.text.toString()!!.isNotEmpty()  && weight?.text.toString()!!.isNotEmpty()
            ) {
//                viewmodel
            }

        }
    }

    private fun clearFields() {
        binding.fragmentRegisterMedicalAppointmentsDoctor.editText?.setText("")
        binding.fragmentRegisterMedicalAppointmentsBloodPressure.editText?.setText("")
        binding.fragmentRegisterMedicalAppointmentsComments.editText?.setText("")
        binding.fragmentRegisterMedicalAppointmentsHeight.editText?.setText("")
        binding.fragmentRegisterMedicalAppointmentsWeight.editText?.setText("")

    }
}