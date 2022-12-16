package com.example.responsi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HomeProductAdapter(
    private val data: ArrayList<HomeProductAdapter.Model>
) :
    RecyclerView.Adapter<HomeProductAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val image: ImageView = view.findViewById(R.id.rvi_home_img)
    }

    data class Model(
        val img: Int
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_item_home, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val index = data[position]

        holder.image.setImageResource(index.img)
    }

    override fun getItemCount(): Int {
        return data.size
    }

}