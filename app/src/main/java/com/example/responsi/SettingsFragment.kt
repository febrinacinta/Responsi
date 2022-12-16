package com.example.responsi

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.responsi.databinding.ActivitySettingsFragmentBinding

class SettingsFragment : Fragment() {
    private lateinit var binding: ActivitySettingsFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = ActivitySettingsFragmentBinding.inflate(inflater, container, false)
        val view = binding.root

        placeData()

        binding.btnEditProfile.setOnClickListener {
            val intent = Intent(activity, EditProfil::class.java)
            startActivity(intent)
        }

        binding.btnAboutUs.setOnClickListener{
            val intent = Intent(activity, AboutUs::class.java)
            startActivity(intent)
        }

        binding.btnActiveHistory.setOnClickListener{
            val intent = Intent(activity, ActiveHistory::class.java)
            startActivity(intent)
        }

        binding.btnExit.setOnClickListener{
            val intent = Intent(activity, LoginActivity::class.java)
            startActivity(intent)
            activity?.finish()
        }

        binding.btnDetailHistory.setOnClickListener {
            val intent = Intent(activity, DetailRiwayat::class.java)
            startActivity(intent)
        }

        return view
    }

    private fun placeData() {
        binding.fragSettingsTvName.text = GlobalVar.name.toString()
        binding.fragSettingsTvEmail.text = GlobalVar.email.toString()
        val address: String = GlobalVar.address.toString()
        if (address.isNotBlank()) {
            binding.fragSettingsTvAddress.text = address
        }
    }

    override fun onResume() {
        super.onResume()
        placeData()
    }
}