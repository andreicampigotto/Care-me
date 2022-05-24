package com.care_me.CareMe.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.care_me.CareMe.R
import com.care_me.CareMe.databinding.FragmentInsertDrugBinding
import com.care_me.CareMe.model.Drug
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FragmentInsertDrug : Fragment(R.layout.fragment_insert_drug) {

    private lateinit var binding: FragmentInsertDrugBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentInsertDrugBinding.bind(view)

    }

    private fun setValueToFields(drug: Drug) {
        binding.incDrug.includeDefaultInsertName.editText?.setText(drug.drugName)
        binding.incDrug.includeDefaultInsertDescription.editText?.setText(drug.drugDescription)
    }

    private fun settingForm() {
        binding.incDrug.includeDefaultInsertButtonSave.setOnClickListener {
            val allergyName = binding.incDrug.includeDefaultInsertName.editText
            val allergyDescription = binding.incDrug.includeDefaultInsertDescription.editText

            if (allergyName?.text?.isNotEmpty()!! && allergyDescription?.text.toString()
                    .isNotEmpty()
            ) {
//                viewmodel
            }

        }
    }

    private fun clearFields() {
        binding.incDrug.includeDefaultInsertName.editText?.setText("")
        binding.incDrug.includeDefaultInsertDescription.editText?.setText("")

    }
}