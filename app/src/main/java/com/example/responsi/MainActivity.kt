package com.example.responsi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.responsi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        replaceFragment(HomeFragment())

        binding.bottomNav.setOnItemSelectedListener {
            when(it.itemId){
                R.id.nav_item_home -> replaceFragment(HomeFragment())
                R.id.nav_item_promo -> replaceFragment(PromoFragment())
                R.id.nav_item_member -> replaceFragment(MemberFragment())
                R.id.nav_item_settings -> replaceFragment(SettingsFragment())

            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(binding.fragContMainActv.id, fragment).commit()
    }
}