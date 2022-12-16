package com.example.responsi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.responsi.databinding.ActivityPromoFragmentBinding

class PromoFragment : Fragment() {
    private lateinit var binding: ActivityPromoFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = ActivityPromoFragmentBinding.inflate(inflater, container, false)
        val view = binding.root

        val data = ArrayList<PromoAdapter.Model> ()

        data.add(PromoAdapter.Model(R.drawable.hotel1, "HOTEL LOTUS", "room", "Rp 249.000", "Rp 299.000"))
        data.add(PromoAdapter.Model(R.drawable.hotel2, "HOTEL BOBOX", "room", "Rp 249.000", "Rp 299.000"))
        data.add(PromoAdapter.Model(R.drawable.hotel3, "HOTEL MOLI", "room", "Rp 249.000", "Rp 299.000"))
        data.add(PromoAdapter.Model(R.drawable.hotel4, "HOTEL ABC", "room", "Rp 249.000", "Rp 299.000"))
        data.add(PromoAdapter.Model(R.drawable.hotel5, "HOTEL JAGUNG", "room", "Rp 249.000", "Rp 299.000"))
        data.add(PromoAdapter.Model(R.drawable.hotel6, "HOTEL MAWAR", "room", "Rp 249.000", "Rp 299.000"))
        data.add(PromoAdapter.Model(R.drawable.hotel7, "HOTEL HITAM", "room", "Rp 249.000", "Rp 299.000"))


        binding.rvContPromo.layoutManager = LinearLayoutManager(activity)
        binding.rvContPromo.adapter = PromoAdapter(data)


        return view
    }
}