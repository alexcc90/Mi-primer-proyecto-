package com.cursokotlin.proyectokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cursokotlin.proyectokotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvhola.text="Hola Amigotes"
        binding.btnhola.text="Entrar"
    }
}

