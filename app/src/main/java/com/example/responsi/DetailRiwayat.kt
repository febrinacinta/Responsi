package com.example.responsi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.responsi.databinding.ActivityDetailRiwayatBinding

class DetailRiwayat : AppCompatActivity() {
    private lateinit var binding: ActivityDetailRiwayatBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailRiwayatBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "Detail Riwayat"

        val data = ArrayList<DetailRiwayatAdapter.Model> ()

        data.add(DetailRiwayatAdapter.Model(R.drawable.img_4, "CARRY OUTER BROWN", "jumlah 2", "Rp 249.000", "Total : Rp 498.000"))
        data.add(DetailRiwayatAdapter.Model(R.drawable.img_4, "CARRY OUTER BROWN", "jumlah 2", "Rp 249.000", "Total : Rp 498.000"))
        data.add(DetailRiwayatAdapter.Model(R.drawable.img_4, "CARRY OUTER BROWN", "jumlah 2", "Rp 249.000", "Total : Rp 498.000"))

        binding.rvContDetailRiwayat.layoutManager = LinearLayoutManager(this)
        binding.rvContDetailRiwayat.adapter = DetailRiwayatAdapter(data)
    }
}