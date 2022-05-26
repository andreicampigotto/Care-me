package com.care_me.CareMe.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.care_me.CareMe.R
import com.care_me.CareMe.databinding.FragmentInsertDiseaseBinding
import com.care_me.CareMe.model.Disease
import com.care_me.CareMe.viewModel.DiseaseViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FragmentInsertDisease : Fragment(R.layout.fragment_insert_disease) {

    private lateinit var binding: FragmentInsertDiseaseBinding
    private lateinit var viewModel: DiseaseViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[DiseaseViewModel::class.java]
        binding = FragmentInsertDiseaseBinding.bind(view)

        setData()
    }

    private fun setValueToFields(disease: Disease) {
        binding.incDisease.includeDefaultInsertName.editText?.setText(disease.name)
        binding.incDisease.includeDefaultInsertDescription.editText?.setText(disease.description)
    }

    private fun setData() {
        binding.incDisease.includeDefaultInsertButtonSave.setOnClickListener {
            val diseaseName = binding.incDisease.includeDefaultInsertName.editText
            val diseaseDescription = binding.incDisease.includeDefaultInsertDescription.editText

            if (diseaseName?.text?.isNotEmpty()!! && diseaseDescription?.text.toString()
                    .isNotEmpty()
            ) {
                viewModel.setDisease(
                    Disease(
                        name = diseaseName.text.toString(),
                        description = diseaseDescription?.text.toString()
                    )
                )
                clearFields()
            }
        }
    }

    private fun clearFields() {
        binding.incDisease.includeDefaultInsertName.editText?.setText("")
        binding.incDisease.includeDefaultInsertDescription.editText?.setText("")

    }
}