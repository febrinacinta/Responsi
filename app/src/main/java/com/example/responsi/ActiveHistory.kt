package com.example.responsi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.responsi.databinding.ActivityActiveHistoryBinding

class ActiveHistory : AppCompatActivity() {
    private lateinit var binding: ActivityActiveHistoryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityActiveHistoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "Riwayat Activate"

        val data = ArrayList<HistoryActivityAdapter.Model>()

        data.add(HistoryActivityAdapter.Model("19278910391","39.000","23 September 2022"))
        data.add(HistoryActivityAdapter.Model("82739180212","30.000","24 September 2022"))
        data.add(HistoryActivityAdapter.Model("19278910391","39.000","23 September 2022"))
        data.add(HistoryActivityAdapter.Model("82739180212","30.000","24 September 2022"))
        data.add(HistoryActivityAdapter.Model("19278910391","39.000","23 September 2022"))
        data.add(HistoryActivityAdapter.Model("82739180212","30.000","24 September 2022"))



        binding.rvContActivityHistory.layoutManager = LinearLayoutManager(this)
        binding.rvContActivityHistory.adapter = HistoryActivityAdapter(data)
    }
}