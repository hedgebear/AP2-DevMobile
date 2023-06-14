package com.example.ap2_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity

class TerceiraTela : AppCompatActivity() {

    private lateinit var nomePessoa : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terceira_tela)

        nomePessoa = intent.getStringExtra("nomePessoa") ?: ""

        val progressBar = findViewById<ProgressBar>(R.id.progressBar3)
        progressBar.progress = 50
        val casual = findViewById<Button>(R.id.casual)
        val explorador = findViewById<Button>(R.id.explorador)
        val hardcore = findViewById<Button>(R.id.hardcore)
        val intent = intent
        var respostaTela2 = intent.getIntExtra("respostaTela2", 0)

        casual.setOnClickListener{
            val intent = Intent(this@TerceiraTela, QuartaTela::class.java)
            respostaTela2 += 3
            intent.putExtra("respostaTela3", respostaTela2)
            intent.putExtra("nomePessoa",nomePessoa)

            startActivity(intent)
        }

        explorador.setOnClickListener{
            val intent = Intent(this@TerceiraTela, QuartaTela::class.java)
            respostaTela2 += 3
            intent.putExtra("respostaTela3", respostaTela2)
            intent.putExtra("nomePessoa",nomePessoa)

            startActivity(intent)
        }

        hardcore.setOnClickListener{
            val intent = Intent(this@TerceiraTela, QuartaTela::class.java)
            respostaTela2 += 7
            intent.putExtra("respostaTela3", respostaTela2)
            intent.putExtra("nomePessoa",nomePessoa)

            startActivity(intent)
        }
    }
}