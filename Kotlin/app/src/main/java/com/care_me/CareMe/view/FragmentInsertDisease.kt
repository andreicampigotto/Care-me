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
        binding.incDisease.includeDefaultInsertName.editText?.setText(disease.diseaseName)
        binding.incDisease.includeDefaultInsertDescription.editText?.setText(disease.diseaseDescription)
    }

    private fun settingForm() {
        binding.incDisease.includeDefaultInsertButtonSave.setOnClickListener {
            val diseaseName = binding.incDisease.includeDefaultInsertName.editText
            val diseaseDescription = binding.incDisease.includeDefaultInsertDescription.editText

            if (diseaseName?.text?.isNotEmpty()!! && diseaseDescription?.text.toString().isNotEmpty()) {
//                viewmodel
            }

        }
    }

    private fun clearFields() {
        binding.incDisease.includeDefaultInsertName.editText?.setText("")
        binding.incDisease.includeDefaultInsertDescription.editText?.setText("")

    }
}