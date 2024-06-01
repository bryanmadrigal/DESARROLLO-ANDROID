package com.example.sesion3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sesion3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    fun isPositive(number: Double): String {
        return if (number > 0) "El $number es psitivo"
        else if (number < 0 ) " El $number es negativo"
        else "El $number es neutro"

    }


    }
}