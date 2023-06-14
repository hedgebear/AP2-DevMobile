package com.example.ap2_app

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import com.example.ap2_app.databinding.ActivityResultadoBinding


class Resultado : AppCompatActivity() {

    private lateinit var binding: ActivityResultadoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultadoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var nome = intent.getStringExtra("nomePessoa") ?: ""

        val progressBar = findViewById<ProgressBar>(R.id.progressBarR)
        progressBar.progress = 100
        val texto = findViewById<TextView>(R.id.result)
        val intent = intent
        var resultadoFinal = intent.getIntExtra("respostaTela4", 0)

        binding.imagem.visibility = View.GONE

        if(resultadoFinal == 37 || resultadoFinal == 40){
            binding.imagem.visibility = View.VISIBLE
            binding.imagem.setImageDrawable(getDrawable(R.drawable.codwarzone))
            texto.text = "$nome esse é o jogo recomendado para você"

            val button = findViewById<Button>(R.id.btweb)
            button.setOnClickListener{
                val webpage = Uri.parse("https://www.callofduty.com/br/pt/warzone")
                val intentweb = Intent(Intent.ACTION_VIEW, webpage)
                startActivity(intentweb)
            }
        }
        else if(resultadoFinal == 39 || resultadoFinal == 43){
            binding.imagem.visibility = View.VISIBLE
            binding.imagem.setImageDrawable(getDrawable(R.drawable.farcry))
            texto.text = "$nome esse é o jogo recomendado para você"

            val button = findViewById<Button>(R.id.btweb)
            button.setOnClickListener{
                val webpage = Uri.parse("https://www.ubisoft.com/pt-br/game/far-cry/far-cry-4")
                val intentweb = Intent(Intent.ACTION_VIEW, webpage)
                startActivity(intentweb)
            }
        }
        else if(resultadoFinal == 41 || resultadoFinal == 44){
            binding.imagem.visibility = View.VISIBLE
            binding.imagem.setImageDrawable(getDrawable(R.drawable.vava))
            texto.text = "$nome esse é o jogo recomendado para você"

            val button = findViewById<Button>(R.id.btweb)
            button.setOnClickListener{
                val webpage = Uri.parse("https://playvalorant.com/pt-br/")
                val intentweb = Intent(Intent.ACTION_VIEW, webpage)
                startActivity(intentweb)
            }
        }
        else if(resultadoFinal == 17 || resultadoFinal == 21){
            binding.imagem.visibility = View.VISIBLE
            binding.imagem.setImageDrawable(getDrawable(R.drawable.monster))
            texto.text = "$nome esse é o jogo recomendado para você"

            val button = findViewById<Button>(R.id.btweb)
            button.setOnClickListener{
                val webpage = Uri.parse("https://store.steampowered.com/app/582010/Monster_Hunter_World/")
                val intentweb = Intent(Intent.ACTION_VIEW, webpage)
                startActivity(intentweb)
            }
        }
        else if(resultadoFinal == 19 || resultadoFinal == 20){
            binding.imagem.visibility = View.VISIBLE
            binding.imagem.setImageDrawable(getDrawable(R.drawable.diablo4))
            texto.text = "$nome esse é o jogo recomendado para você"

            val button = findViewById<Button>(R.id.btweb)
            button.setOnClickListener{
                val webpage = Uri.parse("https://diablo4.blizzard.com/pt-br/")
                val intentweb = Intent(Intent.ACTION_VIEW, webpage)
                startActivity(intentweb)
            }
        }
        else if(resultadoFinal == 23 || resultadoFinal == 24){
            binding.imagem.visibility = View.VISIBLE
            binding.imagem.setImageDrawable(getDrawable(R.drawable.elden))
            texto.text = "$nome esse é o jogo recomendado para você"

            val button = findViewById<Button>(R.id.btweb)
            button.setOnClickListener{
                val webpage = Uri.parse("https://store.steampowered.com/app/1245620/ELDEN_RING/")
                val intentweb = Intent(Intent.ACTION_VIEW, webpage)
                startActivity(intentweb)
            }
        }
        else if(resultadoFinal == 57 || resultadoFinal == 60){
            binding.imagem.visibility = View.VISIBLE
            binding.imagem.setImageDrawable(getDrawable(R.drawable.magicka))
            texto.text = "$nome esse é o jogo recomendado para você"

            val button = findViewById<Button>(R.id.btweb)
            button.setOnClickListener{
                val webpage = Uri.parse("https://store.steampowered.com/app/42910/Magicka/")
                val intentweb = Intent(Intent.ACTION_VIEW, webpage)
                startActivity(intentweb)
            }
        }
        else if(resultadoFinal == 61 || resultadoFinal == 64){
            binding.imagem.visibility = View.VISIBLE
            binding.imagem.setImageDrawable(getDrawable(R.drawable.gungeon))
            texto.text = "$nome esse é o jogo recomendado para você"

            val button = findViewById<Button>(R.id.btweb)
            button.setOnClickListener{
                val webpage = Uri.parse("https://store.steampowered.com/app/311690/Enter_the_Gungeon/")
                val intentweb = Intent(Intent.ACTION_VIEW, webpage)
                startActivity(intentweb)
            }
        }
        else if(resultadoFinal == 59){
            binding.imagem.visibility = View.VISIBLE
            binding.imagem.setImageDrawable(getDrawable(R.drawable.ruinedking))
            texto.text = "$nome esse é o jogo recomendado para você"

            val button = findViewById<Button>(R.id.btweb)
            button.setOnClickListener{
                val webpage = Uri.parse("https://store.steampowered.com/app/1276790/Ruined_King_A_League_of_Legends_Story/")
                val intentweb = Intent(Intent.ACTION_VIEW, webpage)
                startActivity(intentweb)
            }
        }
        else if(resultadoFinal == 63){
            binding.imagem.visibility = View.VISIBLE
            binding.imagem.setImageDrawable(getDrawable(R.drawable.hades))
            texto.text = "$nome esse é o jogo recomendado para você"

            val button = findViewById<Button>(R.id.btweb)
            button.setOnClickListener{
                val webpage = Uri.parse("https://store.epicgames.com/pt-BR/p/hades")
                val intentweb = Intent(Intent.ACTION_VIEW, webpage)
                startActivity(intentweb)
            }
        }

        val button = findViewById<Button>(R.id.voltar)
        button.setOnClickListener{
            val intent = Intent(this@Resultado, MainActivity::class.java)
            startActivity(intent)
        }

    }
}

