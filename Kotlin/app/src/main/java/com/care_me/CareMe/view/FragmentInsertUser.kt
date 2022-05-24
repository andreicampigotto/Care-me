package com.care_me.CareMe.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.care_me.CareMe.R
import com.care_me.CareMe.databinding.FragmentGetProfileBinding
import com.care_me.CareMe.model.User
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FragmentInsertUser : Fragment(R.layout.fragment_get_profile) {

    private lateinit var binding: FragmentGetProfileBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentGetProfileBinding.bind(view)
        settingForm()
        clearFields()

    }

    private fun getValuesFields(user: User) {
        binding.incGetProfile.tiProfileName.editText?.setText(user.fullName)
        binding.incGetProfile.tiProfileBloodType.editText?.setText(user.bloodType)
        binding.incGetProfile.tiProfileHeight.editText?.setText(user.height.toString())
        binding.incGetProfile.tiProfileEmergencyPhone.editText?.setText(user.emergencyPhone)
        binding.incGetProfile.profileTiBirthday.editText?.setText(user.birthday.toString())
        //inseir imagem
    }

    private fun settingForm() {
        binding.incGetProfile.mbtProfileButtonSave.setOnClickListener {
            val name = binding.incGetProfile.tiProfileName.editText
            val birthday = binding.incGetProfile.profileTiBirthday.editText
            val bloodType = binding.incGetProfile.tiProfileBloodType.editText
            val height = binding.incGetProfile.tiProfileHeight.editText
            val emergencyPhone = binding.incGetProfile.tiProfileEmergencyPhone.editText

            if (name?.text?.isNotEmpty()!! && birthday?.text.toString()!!.isNotEmpty() &&
                bloodType?.text.toString()!!.isNotEmpty() &&
                height?.text.toString()!!.isNotEmpty() && emergencyPhone?.text.toString()
                    .isNotEmpty()!!
            ) {
//                viewmodel
            }

        }
    }

    private fun clearFields() {
        binding.incGetProfile.tiProfileName.editText?.setText("")
        binding.incGetProfile.profileTiBirthday.editText?.setText("")
        binding.incGetProfile.tiProfileBloodType.editText?.setText("")
        binding.incGetProfile.tiProfileHeight.editText?.setText("")
        binding.incGetProfile.tiProfileEmergencyPhone.editText?.setText("")
    }
}