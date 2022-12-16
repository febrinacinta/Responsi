package com.example.responsi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PromoAdapter(private val data: ArrayList<PromoAdapter.Model>) :
    RecyclerView.Adapter<PromoAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val img: ImageView = view.findViewById(R.id.rvi_promo_img)
        val title: TextView = view.findViewById(R.id.rvi_promo_title)
        val subtitle: TextView = view.findViewById(R.id.rvi_promo_subtitle)
        val price: TextView = view.findViewById(R.id.rvi_promo_price)
        val discount: TextView = view.findViewById(R.id.rvi_promo_discount)
    }

    data class Model(
        val img: Int,
        val title: String,
        val subtitle: String,
        val price: String,
        val discount: String,
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_item_promo, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val index = data[position]

        holder.img.setImageResource(index.img)
        holder.title.text = index.title
        holder.subtitle.text = index.subtitle
        holder.price.text = index.price
        holder.discount.text = index.discount
    }

    override fun getItemCount(): Int {
        return data.size
    }
}