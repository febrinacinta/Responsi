package com.example.responsi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HistoryActivityAdapter(private val data: ArrayList<HistoryActivityAdapter.Model>) :
    RecyclerView.Adapter<HistoryActivityAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val invoice: TextView = view.findViewById(R.id.rvi_history_invoice)
        val total_price: TextView = view.findViewById(R.id.rvi_history_total_price)
        val time: TextView = view.findViewById(R.id.rvi_history_time)
        val invoice2: TextView = view.findViewById(R.id.rvi_history_invoice2)
        val total_price2: TextView = view.findViewById(R.id.rvi_history_total_price2)
        val time2: TextView = view.findViewById(R.id.rvi_history_time2)
    }

    data class Model (
        val invoice: String,
        val total_price: String,
        val time: String,
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_item_history_activity, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val index = data[position]

        holder.invoice.text = index.invoice
        holder.total_price.text = index.total_price
        holder.time.text = index.time
        holder.invoice2.text = index.invoice
        holder.total_price2.text = index.total_price
        holder.time2.text = index.time
    }

    override fun getItemCount(): Int {
        return data.size
    }
}