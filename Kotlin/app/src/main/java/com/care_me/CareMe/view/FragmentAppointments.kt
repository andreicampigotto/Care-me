package com.care_me.CareMe.view

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.care_me.CareMe.R
import com.care_me.CareMe.adapters.AppointmentAdapter
import com.care_me.CareMe.databinding.FragmentAppointmentsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FragmentAppointments : Fragment(R.layout.fragment_appointments) {

    private lateinit var binding: FragmentAppointmentsBinding

    private val appointmentAdapter = AppointmentAdapter() {}

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentAppointmentsBinding.bind(view)
    }

    private fun setupRecyclerView() = with(binding) {
        adapter = appointmentAdapter
        layoutManager = LinearLayoutManager(requireContext())
        addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                super.onScrollStateChanged(recyclerView, newState)
                if (!recyclerView.canScrollHorizontally(1) && newState == RecyclerView.SCROLL_STATE_IDLE) {
                    viewModel.nextPage()
                }
                hideSoftInput()
            }
        })
    }
    private fun View.hideSoftInput() {
        val inputMethodManager =
            context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(windowToken, 0)
    }
}