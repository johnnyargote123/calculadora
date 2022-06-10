package com.ean.calculadora

import Mundo.dividir
import Mundo.multiplicar
import Mundo.resta
import Mundo.sumar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //llamar botones
        val boton_suma = findViewById<Button>(R.id.button_suma_main)
        val boton_resta = findViewById<Button>(R.id.button_resta_main)
        val boton_multiplicar = findViewById<Button>(R.id.button_multiplicar_main)
        val boton_dividir = findViewById<Button>(R.id.button_division_main)

    //txt
        val txt_numero_uno = findViewById<EditText>(R.id.txt_numero_uno_main)
        val txt_numero_dos = findViewById<EditText>(R.id.txt_numero_dos_main)
    //txtView
        val resultado = findViewById<TextView>(R.id.view_resultado_main)
        //acciones
        //BOTON SUMA _________________________________________>>>>>>>>>>><>>>>>
        boton_suma.setOnClickListener{
            try{
                val numero_uno = txt_numero_uno.text.toString().toDouble()
                val numero_dos = txt_numero_dos.text.toString().toDouble()
                val respuesta= sumar(numero_uno,numero_dos)
                resultado.text = respuesta.toString()
            }
            catch (e: Exception){
                Toast.makeText(this,e.message,Toast.LENGTH_LONG).show()
            }
        }
        //BOTON RESTA _________________________________________>>>>>>>>>>><>>>>>
        boton_resta.setOnClickListener{
            try{
                val numero_uno = txt_numero_uno.text.toString().toDouble()
                val numero_dos = txt_numero_dos.text.toString().toDouble()
                val respuesta= resta(numero_uno,numero_dos)
                resultado.text = respuesta.toString()
            }
            catch (e: Exception){
                Toast.makeText(this,e.message,Toast.LENGTH_LONG).show()
            }
        }
        //BOTON Multiplicar _________________________________________>>>>>>>>>>><>>>>>
        boton_multiplicar.setOnClickListener{
            try{
                val numero_uno = txt_numero_uno.text.toString().toDouble()
                val numero_dos = txt_numero_dos.text.toString().toDouble()
                val respuesta= multiplicar(numero_uno,numero_dos)
                resultado.text = respuesta.toString()
            }
            catch (e: Exception){
                Toast.makeText(this,e.message,Toast.LENGTH_LONG).show()
            }
        }
        //BOTON DIVISION _________________________________________>>>>>>>>>>><>>>>>
        boton_dividir.setOnClickListener{
            try{
                val numero_uno = txt_numero_uno.text.toString().toDouble()
                val numero_dos = txt_numero_dos.text.toString().toDouble()
                val respuesta= dividir(numero_uno,numero_dos)
                resultado.text = respuesta.toString()
            }
            catch (e: Exception){
                Toast.makeText(this,e.message,Toast.LENGTH_LONG).show()
            }
        }
    }
}