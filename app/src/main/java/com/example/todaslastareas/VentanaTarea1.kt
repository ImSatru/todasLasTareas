package com.example.todaslastareas

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.todaslastareas.databinding.ActivityVentanaTarea1Binding
import kotlin.math.sqrt


class VentanaTarea1 : AppCompatActivity() {
    lateinit var campo1:EditText
    lateinit var campo2:EditText
    lateinit var resultado:EditText
    lateinit var botonmayor:Button
    lateinit var botonmenor:Button
    lateinit var botonraiz1:Button
    lateinit var botonraiz2:Button
    lateinit var botonfuncion:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var enlace1 = ActivityVentanaTarea1Binding.inflate(layoutInflater)




        campo1= enlace1.campoNumero1
        campo2=enlace1.campoNumero2
        resultado=enlace1.campoResultado
        botonmayor=enlace1.btnMayor
        botonmenor=enlace1.btnMenor
        botonraiz1=enlace1.btnRaiz1
        botonraiz2=enlace1.btnRaiz2
        botonfuncion=enlace1.btnFuncion
        botonmayor.setOnClickListener{view->
            mayor(view)

        }
        botonmenor.setOnClickListener{view->
            menor(view)
        }
        botonraiz1.setOnClickListener{view->
            raiz1(view)
        }
        botonraiz2.setOnClickListener{view->
            raiz2(view)
        }
        botonfuncion.setOnClickListener{view->
            funcion(view)
        }

        setContentView(enlace1.root)

    }
    fun mayor(view: View){
        val num1=campo1.text.toString().toFloat()
        val num2=campo2.text.toString().toFloat()
        if (num1>num2){
            resultado.setText(num1.toString())
        }
        else if (num2 == num1){
            resultado.setText("Son iguales")

        }
        else {
            resultado.setText(num2.toString())
        }

    }

    fun menor(view:View){
        val num1=campo1.text.toString().toFloat()
        val num2=campo2.text.toString().toFloat()
        if (num1<num2){
            resultado.setText(num1.toString())
        }
        else if (num2 == num1){
            resultado.setText("Son iguales")

        }
        else {
            resultado.setText(num2.toString())
        }



    }
    fun raiz1(view:View){
        val num1=campo1.text.toString().toFloat()
        if (num1>0){
            resultado.setText(sqrt(num1).toString())
        }
        else {
            resultado.setText("No se puede calcular")
        }

    }
    fun raiz2(view:View){
        val num2=campo2.text.toString().toFloat()
        if (num2>0){
            resultado.setText(sqrt(num2).toString())
        }
        else {
            resultado.setText("No se puede calcular")
        }

    }
    fun funcion(view:View){
        val num1=campo1.text.toString().toFloat()
        val num2=campo2.text.toString().toFloat()
        val operacion= num1*num2/num2+num1
        resultado.setText(operacion.toString())
    }
}