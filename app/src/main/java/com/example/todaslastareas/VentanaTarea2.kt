package com.example.todaslastareas

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.todaslastareas.databinding.ActivityVentanaTarea2Binding

class VentanaTarea2 : AppCompatActivity() {
    lateinit var nombre: TextView
    lateinit var nombre2: TextView
    lateinit var resultado: TextView
    lateinit var imgDado: ImageView
    lateinit var imgDado2: ImageView
    lateinit var botonDado: Button
    lateinit var ganaste: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var enlace2 = ActivityVentanaTarea2Binding.inflate(layoutInflater)
        nombre=enlace2.txtNombre
        nombre2=enlace2.txtNombre2
        imgDado=enlace2.imageView
        imgDado2=enlace2.imageView2
        botonDado=enlace2.bntLanzar
        resultado=enlace2.txtResultado
        ganaste=enlace2.txtGanaste

        botonDado.setOnClickListener{view->
            mostrarDato(view)
            mostrarDato2(view)
            mostrarResultado(view)
            mostrarGanaste(view)
        }
        setContentView(enlace2.root)

    }
    fun lanzarDado():String{
        val numero= (1..6).random().toString()
        return numero
    }

    //Lanzar segundo dado

    fun lanzarDado2():String{
        val numero= (1..6).random().toString()
        return numero
    }


    fun mostrarDato(view: View){
        val numero=lanzarDado()
        if(numero.equals("1")){
            imgDado.setImageResource(R.drawable.uno)
        } else if(numero.equals("2")){
            imgDado.setImageResource(R.drawable.doss)
        }else if (numero.equals("3")){
            imgDado.setImageResource(R.drawable.tress)
        }else if (numero.equals("4")){
            imgDado.setImageResource(R.drawable.cuatroo)
        }else if (numero.equals("5")){
            imgDado.setImageResource(R.drawable.cincoo)
        }else if (numero.equals("6")){
            imgDado.setImageResource(R.drawable.seiss)
        }
        nombre.setText(numero)
    }
    //Se muestra y cambia datos del segundo dado
    fun mostrarDato2(view: View){
        val numero=lanzarDado2()
        if(numero.equals("1")){
            imgDado2.setImageResource(R.drawable.uno)
        } else if(numero.equals("2")){
            imgDado2.setImageResource(R.drawable.doss)
        }else if (numero.equals("3")){
            imgDado2.setImageResource(R.drawable.tress)
        }else if (numero.equals("4")){
            imgDado2.setImageResource(R.drawable.cuatroo)
        }else if (numero.equals("5")){
            imgDado2.setImageResource(R.drawable.cincoo)
        }else if (numero.equals("6")){
            imgDado2.setImageResource(R.drawable.seiss)
        }
        nombre2.setText(numero)
    }

    //Se suman los valores de LanzarDado y LanzarDado2
    fun Resultado(): String {
        val resultado = lanzarDado().toInt() + lanzarDado2().toInt()
        return resultado.toString()
    }

    fun mostrarResultado(view: View){
        val suma = Resultado()
        resultado.setText(suma)
    }
    fun mostrarGanaste(view: View){
        val sumaNumeros = lanzarDado().toInt() + lanzarDado2().toInt()
        if (sumaNumeros == 7){
            ganaste.setText("Ganaste!")
        }
    }

}


