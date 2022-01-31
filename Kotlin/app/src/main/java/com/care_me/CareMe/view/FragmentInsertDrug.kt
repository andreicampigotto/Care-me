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
        binding.fragmentDrugName.editText?.setText(drug.drugName)
        binding.fragmentDrugDescription.editText?.setText(drug.drugDescription)
    }

    private fun settingForm() {
        binding.fragmentDrugButtonSave.setOnClickListener {
            val allergyName = binding.fragmentDrugName.editText
            val allergyDescription = binding.fragmentDrugDescription.editText

            if (allergyName?.text?.isNotEmpty()!! && allergyDescription?.text.toString()
                    .isNotEmpty()
            ) {
//                viewmodel
            }

        }
    }

    private fun clearFields() {
        binding.fragmentDrugName.editText?.setText("")
        binding.fragmentDrugDescription.editText?.setText("")

    }
}