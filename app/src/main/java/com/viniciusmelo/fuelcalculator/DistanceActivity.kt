package com.viniciusmelo.fuelcalculator

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class DistanceActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_distance)

        val edt_distancia = findViewById<TextInputEditText>(R.id.edt_distancia)
        val btn_calcular = findViewById<Button>(R.id.btn_calcular)
        val preco = intent.getFloatExtra("preco", 0f)
        val consumo = intent.getFloatExtra("consumo", 0f)

        btn_calcular.setOnClickListener {

        val distanciaSpring: String = edt_distancia.text.toString()

        if (distanciaSpring == "") {
           Snackbar
           .make(
           edt_distancia,
           "Preenche a distancia do trajeto",
           Snackbar.LENGTH_LONG
           )
           .show()

        } else {

         val distancia: Float = distanciaSpring.toFloat()
         val resultado = (distancia / consumo) * preco
         val intent4 = Intent(this, ResultActivity::class.java)
         .apply {
         putExtra("preco", preco)
         putExtra("consumo", consumo)
         putExtra("distancia", distancia)
         putExtra("resultado", resultado)
         }
         startActivity(intent4)

            }
        }
    }
}