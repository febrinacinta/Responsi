package com.example.responsi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MemberAdapter(private val data: ArrayList<MemberAdapter.Model>) : RecyclerView.Adapter<MemberAdapter.ViewHolder>(){
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val img: ImageView = view.findViewById(R.id.rvi_member_img)
        val price: TextView = view.findViewById(R.id.rvi_member_price)
        val discount: TextView = view.findViewById(R.id.rvi_member_discount)
        val total_price: TextView = view.findViewById(R.id.rvi_member_total_price)
    }

    data class Model (
        val img: Int,
        val price: String,
        val discount: String,
        val total_price: String,
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rvi_member, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val index = data[position]

        holder.img.setImageResource(index.img)
        holder.price.text = index.price
        holder.discount.text = index.discount
        holder.total_price.text = index.total_price
    }

    override fun getItemCount(): Int {
        return data.size
    }

}