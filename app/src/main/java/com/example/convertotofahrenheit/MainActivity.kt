package com.example.convertotofahrenheit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //habilitar campos de entrada e saida
        val txtCelsius = findViewById<EditText>(R.id.txtCelsius)
        val txtResultado = findViewById<TextView>(R.id.txt_Resultado)
        val btnConverter = findViewById<Button>(R.id.btn_Converter)


        btnConverter.setOnClickListener{
            if(txtCelsius.text.isEmpty()){
                //validação de dados
                txtCelsius.error = "Digite a temperatura em celsius: "
            }else {
                //entrada de dados
                val celsius = txtCelsius.text.toString().toDouble()
                //processamento
                val resultado: Double
                resultado = (9*celsius+160)/5
                txtResultado.text = "$celsius Graus celsius equivale  a $resultado Graus Fahrenheit"
                txtCelsius.text.clear()
            }
        }
    }
}