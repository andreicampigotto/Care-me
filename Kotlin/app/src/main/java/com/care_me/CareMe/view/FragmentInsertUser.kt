package com.care_me.CareMe.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.care_me.CareMe.R
import com.care_me.CareMe.databinding.FragmentProfileBinding
import com.care_me.CareMe.model.User
import dagger.hilt.EntryPoint
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FragmentInsertUser : Fragment(R.layout.fragment_profile) {

    private lateinit var binding: FragmentProfileBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentProfileBinding.bind(view)
        settingForm()
        clearFields()

    }

    private fun setValueToFields(user: User) {
        binding.fragmentProfileName.editText?.setText(user.fullName)
        binding.fragmentProfilePhone.editText?.setText(user.phone)
        binding.fragmentProfileBirthday .editText?.setText(user.birthday.toString())
        binding.fragmentProfileBloodType.editText?.setText(user.bloodType)
        binding.fragmentProfileEmergencyPhone.editText?.setText(user.emergencyPhone)
        binding.fragmentProfileCity.editText?.setText(user.city)
        binding.fragmentProfileCountry .editText?.setText(user.country)
        //inseir imagem
    }

    private fun settingForm() {
        binding.fragmentProfileButtonSave.setOnClickListener {
            val name = binding.fragmentProfileName.editText
            val phone = binding.fragmentProfilePhone.editText
            val birthday = binding.fragmentProfileBirthday.editText
            val bloodType = binding.fragmentProfileBloodType.editText
            val emergencyPhone = binding.fragmentProfileEmergencyPhone.editText
            val city = binding.fragmentProfileCity.editText
            val country =binding.fragmentProfileCountry.editText

            if (name?.text?.isNotEmpty()!! && phone?.text.toString()
                    .isNotEmpty()!! && birthday?.text.toString()!!.isNotEmpty() && bloodType?.text.toString()!!.isNotEmpty()
                && emergencyPhone?.text.toString()!!.isNotEmpty() && city?.text.toString()!!.isNotEmpty()
                 && country?.text.toString()!!.isNotEmpty()
            ) {
//                viewmodel
            }

        }
    }

    private fun clearFields() {
        binding.fragmentProfileName.editText?.setText("")
        binding.fragmentProfilePhone.editText?.setText("")
        binding.fragmentProfileBirthday.editText?.setText("")
        binding.fragmentProfileBloodType.editText?.setText("")
        binding.fragmentProfileEmergencyPhone.editText?.setText("")
        binding.fragmentProfileCity.editText?.setText("")
        binding.fragmentProfileCountry.editText?.setText("")
    }
}