package com.example.intentsapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.intentsapp.databinding.ActivityMainBinding
import com.example.intentsapp.databinding.ActivityShowBinding

class ShowActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityShowBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShowBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val extras = intent.extras
        val nombre = extras?.getString("Nombres")
        binding.showFirstName.text = nombre
        val apellido = extras?.getString("Apellidos")
        binding.showLastName.text = apellido
    }
}