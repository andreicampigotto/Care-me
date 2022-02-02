package com.care_me.CareMe.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.care_me.CareMe.R
import com.care_me.CareMe.databinding.FragmentInsertDiseaseBinding
import com.care_me.CareMe.model.Disease
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FragmentInsertDisease: Fragment(R.layout.fragment_insert_disease) {

    private lateinit var binding: FragmentInsertDiseaseBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentInsertDiseaseBinding.bind(view)

    }

    private fun setValueToFields(disease: Disease) {
        binding.fragmentDiseaseName.editText?.setText(disease.diseaseName)
        binding.fragmentDiseaseDescription.editText?.setText(disease.diseaseDescription)
    }

    private fun settingForm() {
        binding.fragmentDiseaseButtonSave.setOnClickListener {
            val diseaseName = binding.fragmentDiseaseName.editText
            val diseaseDescription = binding.fragmentDiseaseDescription.editText

            if (diseaseName?.text?.isNotEmpty()!! && diseaseDescription?.text.toString().isNotEmpty()) {
//                viewmodel
            }

        }
    }

    private fun clearFields() {
        binding.fragmentDiseaseName.editText?.setText("")
        binding.fragmentDiseaseDescription.editText?.setText("")

    }
}