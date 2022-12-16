package com.example.responsi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.responsi.databinding.ActivityHomeFragmentBinding


class HomeFragment : Fragment() {
    private lateinit var binding: ActivityHomeFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = ActivityHomeFragmentBinding.inflate(inflater, container, false)
        val view = binding.root

        val data = ArrayList<HomeProductAdapter.Model>()

        data.add(HomeProductAdapter.Model(R.drawable.hotel1))
        data.add(HomeProductAdapter.Model(R.drawable.hotel2))
        data.add(HomeProductAdapter.Model(R.drawable.hotel3))
        data.add(HomeProductAdapter.Model(R.drawable.hotel4))
        data.add(HomeProductAdapter.Model(R.drawable.hotel5))
        data.add(HomeProductAdapter.Model(R.drawable.hotel6))
        data.add(HomeProductAdapter.Model(R.drawable.hotel7))
        data.add(HomeProductAdapter.Model(R.drawable.hotel8))



        binding.rvContHome.layoutManager = LinearLayoutManager(activity)
        binding.rvContHome.adapter = HomeProductAdapter(data)

        return view
    }
}