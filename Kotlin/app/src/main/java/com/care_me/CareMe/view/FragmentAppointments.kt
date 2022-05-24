package com.care_me.CareMe.view

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.care_me.CareMe.R
import com.care_me.CareMe.adapters.AppointmentAdapter
import com.care_me.CareMe.databinding.FragmentAppointmentsBinding
import com.care_me.CareMe.viewModel.AppointmentsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FragmentAppointments : Fragment(R.layout.fragment_appointments) {

    private lateinit var binding: FragmentAppointmentsBinding
    private lateinit var viewModel: AppointmentsViewModel

    private val appointmentAdapter = AppointmentAdapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[AppointmentsViewModel::class.java]
        binding = FragmentAppointmentsBinding.bind(view)
        setupRecyclerView()
        setupObservers()
        viewModel.getAppointments()
    }

    private fun setupObservers(){
        viewModel.appointmentList.observe(viewLifecycleOwner) {
            appointmentAdapter.updateList(it)
        }
    }

    private fun setupRecyclerView() = with(binding.rvAppointments) {
        adapter = appointmentAdapter
        layoutManager = LinearLayoutManager(requireContext())
    }
}

private fun View.hideSoftInput() {
    val inputMethodManager =
        context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    inputMethodManager.hideSoftInputFromWindow(windowToken, 0)
}
