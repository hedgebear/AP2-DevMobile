package com.example.ap2_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity

class QuartaTela : AppCompatActivity() {

    private lateinit var nomePessoa :String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quarta_tela)

        nomePessoa = intent.getStringExtra("nomePessoa") ?: ""

        val progressBar = findViewById<ProgressBar>(R.id.progressBar4)
        progressBar.progress = 75
        val online = findViewById<Button>(R.id.online)
        val offline = findViewById<Button>(R.id.offline)
        val ambos = findViewById<Button>(R.id.ambos)
        var respostaTela3 = intent.getIntExtra("respostaTela3", 0)

        online.setOnClickListener{
            val intent = Intent(this@QuartaTela, Resultado::class.java)
            respostaTela3 += 4
            intent.putExtra("respostaTela4", respostaTela3)
            intent.putExtra("nomePessoa",nomePessoa)

            startActivity(intent)
        }

        offline.setOnClickListener{
            val intent = Intent(this@QuartaTela, Resultado::class.java)
            respostaTela3 += 6
            intent.putExtra("respostaTela4", respostaTela3)
            intent.putExtra("nomePessoa",nomePessoa)

            startActivity(intent)
        }

        ambos.setOnClickListener{
            val intent = Intent(this@QuartaTela, Resultado::class.java)
            respostaTela3 += 7
            intent.putExtra("respostaTela4", respostaTela3)
            intent.putExtra("nomePessoa",nomePessoa)

            startActivity(intent)
        }
    }
}