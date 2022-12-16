package com.example.responsi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.responsi.databinding.ActivityEditProfilBinding

class EditProfil : AppCompatActivity() {
    private lateinit var binding: ActivityEditProfilBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditProfilBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "Edit Profil"
        placeData()

        binding.btnEditProfileSave.setOnClickListener {
            GlobalVar.name = binding.edEditProfileName.text.toString()
            GlobalVar.email = binding.edEditProfileEmail.text.toString()
            GlobalVar.address = binding.edEditProfileAddress.text.toString()
            val text = "Data berhasil disimpan!"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
        }
    }

    private fun placeData() {
        binding.edEditProfileName.setText(GlobalVar.name.toString())
        binding.edEditProfileEmail.setText(GlobalVar.email.toString())
        binding.edEditProfileAddress.setText(GlobalVar.address.toString())
    }
}