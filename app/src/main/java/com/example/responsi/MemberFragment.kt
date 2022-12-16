package com.example.responsi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.responsi.databinding.ActivityMemberFragmentBinding


class MemberFragment : Fragment() {
    private lateinit var binding: ActivityMemberFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = ActivityMemberFragmentBinding.inflate(inflater, container, false)
        val view = binding.root

        val data = ArrayList<MemberAdapter.Model> ()

        data.add(MemberAdapter.Model(R.drawable.hotel1, "500.000", "99.000", "401.000"))
        data.add(MemberAdapter.Model(R.drawable.hotel2, "475.000", "99.000", "376.000"))
        data.add(MemberAdapter.Model(R.drawable.hotel3, "485.000", "99.000", "386.000"))
        data.add(MemberAdapter.Model(R.drawable.hotel4, "510.000", "99.000", "411.000"))
        data.add(MemberAdapter.Model(R.drawable.hotel5, "420.000", "99.000", "321.000"))
        data.add(MemberAdapter.Model(R.drawable.hotel6, "380.000", "99.000", "281.000"))
        data.add(MemberAdapter.Model(R.drawable.hotel7, "370.000", "99.000", "271.000"))
        data.add(MemberAdapter.Model(R.drawable.hotel8, "555.000", "99.000", "456.000"))


        binding.rvContMember.layoutManager = GridLayoutManager(activity, 2)
        binding.rvContMember.adapter = MemberAdapter(data)

        return view
    }
}