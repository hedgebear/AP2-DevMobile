package com.example.ap2_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity

class SegundaTela : AppCompatActivity() {

    private lateinit var nomePessoa : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_tela)

        nomePessoa = intent.getStringExtra("nomePessoa") ?: ""
        val progressBar = findViewById<ProgressBar>(R.id.progressBar2)
        progressBar.progress = 25
        val fps = findViewById<Button>(R.id.fps)
        val rpg= findViewById<Button>(R.id.rpg)
        val rogue = findViewById<Button>(R.id.rogue)
        var result = 0

        fps.setOnClickListener{
            val intent = Intent(this@SegundaTela, TerceiraTela::class.java)
            result = 30
            intent.putExtra("respostaTela2", result)
            intent.putExtra("nomePessoa",nomePessoa)

            startActivity(intent)
        }

        rpg.setOnClickListener{
            val intent = Intent(this@SegundaTela, TerceiraTela::class.java)
            result = 10
            intent.putExtra("respostaTela2", result)
            intent.putExtra("nomePessoa",nomePessoa)

            startActivity(intent)
        }

        rogue.setOnClickListener{
            val intent = Intent(this@SegundaTela, TerceiraTela::class.java)
            result = 50
            intent.putExtra("respostaTela2", result)
            intent.putExtra("nomePessoa",nomePessoa)

            startActivity(intent)
        }
    }
}