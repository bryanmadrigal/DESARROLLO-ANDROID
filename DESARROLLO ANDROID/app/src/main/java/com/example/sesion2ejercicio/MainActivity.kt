package com.example.sesion2ejercicio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sesion2ejercicio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        var name:String = "Bryan"
        var number1:Float = 3.0f
        var number2:Double = 3.0
        var num3: Int = 3

        val city = "Managua"

    }





}
