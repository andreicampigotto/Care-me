package com.care_me.CareMe.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.care_me.CareMe.R
import com.care_me.CareMe.databinding.FragmentInsertAllergyBinding
import com.care_me.CareMe.model.Allergy
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FragmentInsertAllergy : Fragment(R.layout.fragment_insert_allergy) {

    private lateinit var binding: FragmentInsertAllergyBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentInsertAllergyBinding.bind(view)

    }

    private fun setValueToFields(allergy: Allergy) {
        binding.fragmentAllergyName.editText?.setText(allergy.allergyName)
        binding.fragmentAllergyDescription.editText?.setText(allergy.allergyDescription)
    }

    private fun settingForm() {
        binding.fragmentAllergyButtonSave.setOnClickListener {
            val allergyName = binding.fragmentAllergyName.editText
            val allergyDescription = binding.fragmentAllergyDescription.editText

            if (allergyName?.text?.isNotEmpty()!! && allergyDescription?.text.toString()
                    .isNotEmpty()
            ) {
//                viewmodel
            }

        }
    }

    private fun clearFields() {
        binding.fragmentAllergyName.editText?.setText("")
        binding.fragmentAllergyDescription.editText?.setText("")

    }
}