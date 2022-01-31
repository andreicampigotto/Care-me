package com.care_me.CareMe.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.care_me.CareMe.R

class AllergyAdapter(
    private val allergyList: List<String>
) : RecyclerView.Adapter<AllergyAdapter.AllergyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AllergyViewHolder =
        AllergyViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.card_medical_appointments, parent, false)
        )

    override fun onBindViewHolder(holder: AllergyViewHolder, position: Int) {
        holder.bind(allergyList[position])
    }

    override fun getItemCount(): Int = allergyList.size


    inner class AllergyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val textView: TextView =
            itemView.findViewById(R.id.card_medical_appointments_allergy_value)

        fun bind(allergy: String) {
            textView.text = allergy
        }
    }
}