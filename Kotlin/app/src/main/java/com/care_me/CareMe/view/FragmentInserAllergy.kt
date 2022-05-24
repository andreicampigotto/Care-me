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
        //setValueToFields()

    }


    private fun setValueToFields(allergy: Allergy) {
        binding.incAllergy.includeDefaultInsertName.editText?.setText(allergy.allergyName)
        binding.incAllergy.includeDefaultInsertDescription.editText?.setText(allergy.allergyDescription)
    }

    private fun settingForm() {
        binding.incAllergy.includeDefaultInsertButtonSave.setOnClickListener {
            val allergyName = binding.incAllergy.includeDefaultInsertName.editText
            val allergyDescription = binding.incAllergy.includeDefaultInsertDescription.editText

            if (allergyName?.text?.isNotEmpty()!! && allergyDescription?.text.toString()
                    .isNotEmpty()
            ) {
//                viewmodel
            }

        }
    }

    private fun clearFields() {
        binding.incAllergy.includeDefaultInsertName.editText?.setText("")
        binding.incAllergy.includeDefaultInsertDescription.editText?.setText("")

    }
}