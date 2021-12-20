package com.cristiano.cartaodevacina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

lateinit var textMensage7: TextView
lateinit var textMensage8: TextView

class VacinasDisponiveisActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_certificado)

        textMensage7 = findViewById(R.id.textMensage7)
        val valor =
            getIntent().getStringExtra("nome")
        textMensage7.text = valor
        textMensage8 = findViewById(R.id.textMensage8)
        val mae = getIntent().getStringExtra("mae")
        textMensage8.text = mae

    }
}