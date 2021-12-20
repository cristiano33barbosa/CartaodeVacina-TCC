package com.cristiano.cartaodevacina

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


    private lateinit var editTextLogin : EditText
    private lateinit var editTextPassword : EditText
    private lateinit var btentrar : Button
    private lateinit var btCadastrar : Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextLogin = findViewById(R.id.edit_login)
        editTextPassword = findViewById(R.id.edit_senha)
        btentrar = findViewById((R.id.button10))
        btCadastrar = findViewById(R.id.button11)



        btentrar.setOnClickListener {

            validaForm()
        }
        btCadastrar.setOnClickListener{
            val intent = Intent(this, Cadastro::class.java)
            startActivity(intent)
        }

    }
    private fun validaForm() : Boolean{
        var error = false
        if (editTextLogin.text.isEmpty()) {
            editTextLogin.error = "Campo Login deve ser preenchido!"
            error = true
        }
        if (editTextPassword.text.isEmpty()) {
            editTextPassword.error = "Campo Senha deve ser preenchido!"
            error = true
        }else{
            btentrar.setOnClickListener {
                val intent = Intent(this, MenuActivity::class.java)
                intent.putExtra("login", editTextLogin.getText().toString())
                startActivity(intent)
                finish()
            }

        }

        return false
    }

}