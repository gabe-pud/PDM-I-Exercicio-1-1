package br.edu.fatecpg.appboasvindas.view

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.edu.fatecpg.appboasvindas.R

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val edtNome: EditText = findViewById(R.id.edt_nome)
        val edtIdade: EditText = findViewById(R.id.edt_idade)
        val btnEnviar: Button = findViewById(R.id.btn_enviar)
        val txvMensagem: TextView = findViewById(R.id.txv_mensagem)

        btnEnviar.setOnClickListener {
            val nome = edtNome.text
            val idade = edtIdade.text

            txvMensagem.text = "Bem Vindo $nome!\nsua idade é: $idade"
        }
    }
}