package com.viniciusmelo.fuelcalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        enableEdgeToEdge()

        val btn_iniciar = findViewById<Button>(R.id.btn_iniciar)

        btn_iniciar.setOnClickListener {


            val intent = Intent(this, GasActivity::class.java)

            startActivity(intent)

        }
    }
}