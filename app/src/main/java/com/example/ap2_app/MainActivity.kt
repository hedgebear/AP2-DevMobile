package com.example.ap2_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar

class MainActivity : AppCompatActivity() {

    private lateinit var nome : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.proximo)
        nome = findViewById(R.id.nome)
        val progressBar = findViewById<ProgressBar>(R.id.progressBar)
        progressBar.progress = 0

        button.setOnClickListener{
            val nomePessoa = nome.text.toString()
            val intent = Intent(this@MainActivity, SegundaTela::class.java)
            intent.putExtra("nomePessoa", nomePessoa)
            startActivity(intent)
        }
    }
}


