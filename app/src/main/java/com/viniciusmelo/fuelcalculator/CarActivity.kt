package com.viniciusmelo.fuelcalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class CarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_car)

        val btn_car = findViewById<Button>(R.id.btn_carro)
        val edtConsumo = findViewById<TextInputEditText>(R.id.edt_consumo)
        val preco = intent.getFloatExtra("preco", 0f)

        btn_car.setOnClickListener {
        val consumosSpring: String = edtConsumo.text.toString()

        if (consumosSpring == "") {

            Snackbar
            .make(
            edtConsumo,
            "Preencha o consumo do carro",
            Snackbar.LENGTH_LONG
            )
            .show()

        } else {

        val consumo: Float = consumosSpring.toFloat()


        val intent3 = Intent(this, DistanceActivity::class.java)
        .apply {
        putExtra("consumo", consumo)
        putExtra("preco", preco)
        }

        startActivity(intent3)

           }
        }
    }
}