package com.care_me.CareMe.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.care_me.CareMe.R
import com.care_me.CareMe.databinding.FragmentInsertDrugBinding
import com.care_me.CareMe.model.Drug
import com.care_me.CareMe.viewModel.DrugViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FragmentInsertDrug : Fragment(R.layout.fragment_insert_drug) {

    private lateinit var binding: FragmentInsertDrugBinding
    private lateinit var viewModel: DrugViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[DrugViewModel::class.java]
        binding = FragmentInsertDrugBinding.bind(view)
        
        setData()
    }

    private fun setData() {
        binding.incDrug.includeDefaultInsertButtonSave.setOnClickListener {
            val drugName = binding.incDrug.includeDefaultInsertName.editText
            val drugDescription = binding.incDrug.includeDefaultInsertDescription.editText

            if (drugName?.text?.isNotEmpty()!! && drugDescription?.text.toString()
                    .isNotEmpty()
            ) {
                viewModel.setDrug(
                    Drug(
                        name = drugName.text.toString(),
                        description = drugDescription?.text.toString()
                    )
                )
                clearFields()
            }
        }
    }

    private fun clearFields() {
        binding.incDrug.includeDefaultInsertName.editText?.setText("")
        binding.incDrug.includeDefaultInsertDescription.editText?.setText("")

    }
}