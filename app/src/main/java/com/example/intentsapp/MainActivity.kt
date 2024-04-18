package com.example.intentsapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.intentsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), OnClickListener {
    private  lateinit var binding: ActivityMainBinding
    lateinit var nombre: String
    lateinit var apellidos: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.submitButton.setOnClickListener(this)
        binding.browserButton.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v){
            binding.submitButton->{
               nombre = binding.firstNameText.text.toString()
               apellidos = binding.lastNameText.text.toString()
               intent = Intent(this,
                   ShowActivity::class.java).apply {
                   putExtra("Nombres", nombre)
                   putExtra("Apellidos", apellidos)
               }
                startActivity(intent)
            }
        }
    }
}