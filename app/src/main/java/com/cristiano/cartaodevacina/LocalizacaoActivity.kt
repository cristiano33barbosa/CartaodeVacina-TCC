package com.cristiano.cartaodevacina

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

private lateinit var btlink1: Button

class LocalizacaoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_localizacao)

        btlink1 = findViewById(R.id.btPesquisa)

        btlink1.setOnClickListener {

            openIntent()
        }
    }

    private fun openIntent()  {
        val uri : Uri?
        val intent : Intent?

        uri = Uri.parse("https://www.google.com.br/maps/@-7.9882885,-34.9314705,17z")
        intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)


    }


}