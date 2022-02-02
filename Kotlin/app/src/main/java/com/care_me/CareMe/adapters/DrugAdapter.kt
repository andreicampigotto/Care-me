package com.care_me.CareMe.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.care_me.CareMe.R

class DrugAdapter(
    private val drugList: List<String>
) : RecyclerView.Adapter<DrugAdapter.DrugViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DrugViewHolder =
        DrugViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.card_medical_appointments, parent, false)
        )

    override fun onBindViewHolder(holder: DrugViewHolder, position: Int) {
        holder.bind(drugList[position])
    }

    override fun getItemCount(): Int = drugList.size


    inner class DrugViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val textView: TextView =
            itemView.findViewById(R.id.card_medical_appointments_medications_value)

        fun bind(drug: String) {
            textView.text = drug
        }
    }
}