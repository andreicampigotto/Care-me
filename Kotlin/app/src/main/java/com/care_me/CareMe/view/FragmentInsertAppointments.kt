package com.care_me.CareMe.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.care_me.CareMe.R
import com.care_me.CareMe.databinding.FragmentMedicalAppointmentBinding
import com.care_me.CareMe.model.Appointment
import com.care_me.CareMe.viewModel.AppointmentsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FragmentInsertAppointments : Fragment(R.layout.fragment_medical_appointment) {

    private lateinit var binding: FragmentMedicalAppointmentBinding
    private lateinit var viewModel: AppointmentsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentMedicalAppointmentBinding.bind(view)
        viewModel = ViewModelProvider(this)[AppointmentsViewModel::class.java]
        settingForm()

    }

    private fun setValueToFields(appointment: Appointment) {
        binding.icMedicalAppointment.fragmentRegisterMedicalAppointmentsDoctor.editText?.setText(
            appointment.doctor
        )
        binding.icMedicalAppointment.fragmentRegisterMedicalAppointmentsBloodPressure.editText?.setText(
            appointment.bloodPressure
        )
        binding.icMedicalAppointment.fragmentRegisterMedicalAppointmentsComments.editText?.setText(
            appointment.comments
        )
        binding.icMedicalAppointment.fragmentRegisterMedicalAppointmentsWeight.editText?.setText(
            appointment.weight.toString()
        )
    }

    private fun settingForm() {
        binding.icMedicalAppointment.mbtRegisterMedicalAppointmentsButtonSave.setOnClickListener {
            val doctor =
                binding.icMedicalAppointment.fragmentRegisterMedicalAppointmentsDoctor.editText
            val bloodPressure =
                binding.icMedicalAppointment.fragmentRegisterMedicalAppointmentsBloodPressure.editText
            val comments =
                binding.icMedicalAppointment.fragmentRegisterMedicalAppointmentsComments.editText
            val weight =
                binding.icMedicalAppointment.fragmentRegisterMedicalAppointmentsWeight.editText

            if (doctor?.text?.isNotEmpty()!! && bloodPressure?.text.toString()
                    .isNotEmpty()!! && comments?.text.toString()!!
                    .isNotEmpty() && weight?.text.toString()!!.isNotEmpty()
            ) {
                /**
                 * somente setar os valores
                 */
                viewModel.setAppointment(
                    Appointment(
                        0,
                        appointment = "01/02/2022",
                        weight = binding.icMedicalAppointment.etWeigth.text.toString().toFloat(),
                        bloodPressure = binding.icMedicalAppointment.etBlood.text.toString(),
                        comments = binding.icMedicalAppointment.etDesc.text.toString(),
                        doctor = binding.icMedicalAppointment.etDoctor.text.toString(),
                        presentDate = "01/02/2022"
                    )
                )
            }
        }
    }

    private fun clearFields() {
        binding.icMedicalAppointment.fragmentRegisterMedicalAppointmentsDoctor.editText?.setText("")
        binding.icMedicalAppointment.fragmentRegisterMedicalAppointmentsBloodPressure.editText?.setText(
            ""
        )
        binding.icMedicalAppointment.fragmentRegisterMedicalAppointmentsComments.editText?.setText("")
        binding.icMedicalAppointment.fragmentRegisterMedicalAppointmentsWeight.editText?.setText("")
    }
}