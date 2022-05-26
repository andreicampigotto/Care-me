package com.care_me.CareMe.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.care_me.CareMe.R
import com.care_me.CareMe.databinding.FragmentInsertAllergyBinding
import com.care_me.CareMe.model.Allergy
import com.care_me.CareMe.viewModel.AllergyViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FragmentInsertAllergy : Fragment(R.layout.fragment_insert_allergy) {

    private lateinit var binding: FragmentInsertAllergyBinding
    private lateinit var viewModel: AllergyViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[AllergyViewModel::class.java]
        binding = FragmentInsertAllergyBinding.bind(view)

        setData()
    }

    private fun setData() {
        binding.incAllergy.includeDefaultInsertButtonSave.setOnClickListener {

            val allergyName = binding.incAllergy.includeDefaultInsertName.editText
            val allergyDescription = binding.incAllergy.includeDefaultInsertDescription.editText

            if (allergyName?.text?.isNotEmpty()!! &&
                allergyDescription?.text.toString().isNotEmpty()
            ) {
                viewModel.setAllergy(
                    Allergy(
                        name = allergyName.text.toString(),
                        description = allergyDescription?.text.toString()
                    )
                )
                clearFields()
            }

        }
    }

    private fun clearFields() {
        binding.incAllergy.includeDefaultInsertName.editText?.setText("")
        binding.incAllergy.includeDefaultInsertDescription.editText?.setText("")
    }
}