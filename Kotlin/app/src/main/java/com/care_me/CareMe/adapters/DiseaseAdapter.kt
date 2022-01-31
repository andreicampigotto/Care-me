package com.care_me.CareMe.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.care_me.CareMe.R

class DiseaseAdapter(
    private val diseaseList: List<String>
) : RecyclerView.Adapter<DiseaseAdapter.DiseaseViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DiseaseViewHolder =
        DiseaseViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.card_medical_appointments, parent, false)
        )

    override fun onBindViewHolder(holder: DiseaseViewHolder, position: Int) {
        holder.bind(diseaseList[position])
    }

    override fun getItemCount(): Int = diseaseList.size


    inner class DiseaseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val textView: TextView =
            itemView.findViewById(R.id.card_medical_appointments_disease_value)

        fun bind(disease: String) {
            textView.text = disease
        }
    }
}