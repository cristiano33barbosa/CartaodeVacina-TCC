package com.cristiano.cartaodevacina

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

private lateinit var btContinuar: Button
private lateinit var editTextNomeCom: EditText
private lateinit var editTextMae: EditText

class CertActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cert)

        btContinuar = findViewById(R.id.button15)

        editTextNomeCom = findViewById(R.id.editTextName)
        editTextMae = findViewById(R.id.editTextName2)

        btContinuar.setOnClickListener(View.OnClickListener (){
            val intent = Intent(this, VacinasDisponiveisActivity::class.java)
            intent.putExtra("nome", editTextNomeCom.getText().toString())
            intent.putExtra("mae", editTextMae.getText().toString())
            startActivity(intent)
            finish()
        })

    }
}