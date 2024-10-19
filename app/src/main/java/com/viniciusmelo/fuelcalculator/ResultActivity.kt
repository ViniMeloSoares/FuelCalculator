package com.viniciusmelo.fuelcalculator

import android.annotation.SuppressLint
import android.content.Intent
import android.icu.text.NumberFormat
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Locale

class ResultActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)

        val btn_resultado = findViewById<Button>(R.id.btn_novocalculo)
        val preco = intent.getFloatExtra("preco" , 0f)
        val consumo = intent.getFloatExtra("consumo" , 0f)
        val distancia = intent.getFloatExtra("distancia" , 0f)
        val resultado = intent.getFloatExtra("resultado" , 0f)

        val result_text= findViewById<TextView>(R.id.text_resultado)
        val preco_result = findViewById<TextView>(R.id.preco_result)
        val consumo_result = findViewById<TextView>(R.id.consumo_result)
        val distancia_result = findViewById<TextView>(R.id.distancia_result)


        result_text.text = "R$ %.2f".format(resultado)
        preco_result.text = "Preço do Combustível: R$ %.2f".format(preco)
        consumo_result.text = "Consumo do carro: %.1f km/l".format(consumo)
        distancia_result.text = "Distancia à percorrer: %.0f km".format(distancia)

        val button_reiniciar = findViewById<Button>(R.id.btn_novocalculo)

        button_reiniciar.setOnClickListener {

        val intent = Intent (this,MainActivity::class.java)

        startActivity(intent)

        }
    }
}