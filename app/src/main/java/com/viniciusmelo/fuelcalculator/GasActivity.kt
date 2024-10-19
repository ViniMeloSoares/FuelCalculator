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

class GasActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_gas)

        val btn_gas = findViewById<Button>(R.id.btn_gas)
        val edt_preco = findViewById<TextInputEditText>(R.id.edt_combustivel)


    btn_gas.setOnClickListener {

        val precostring = edt_preco.text.toString()

        if (precostring =="") {
        Snackbar
        .make(
            edt_preco,
            "Preencha o valor do combustível",
            Snackbar.LENGTH_LONG
        )
        .show()
        }

        else {

        val preco: Float = precostring.toFloat()

        val intent2 = Intent(this, CarActivity::class.java)
        .apply {
        putExtra("preco", preco)
        }

        startActivity(intent2)

      }
    }
  }
}