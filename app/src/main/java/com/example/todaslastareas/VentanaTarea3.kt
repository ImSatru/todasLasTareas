package com.example.todaslastareas

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.todaslastareas.databinding.ActivityVentanaTarea3Binding
import kotlin.random.Random


class VentanaTarea3 : AppCompatActivity() {

    lateinit var enlace3: ActivityVentanaTarea3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // layout con View Binding
        enlace3 = ActivityVentanaTarea3Binding.inflate(layoutInflater)
        setContentView(enlace3.root)

        // Botón para jugar
        enlace3.btnJugar.setOnClickListener {
            generarNumerosAleatorios()
        }

        // Generar los primeros números aleatorios al iniciar la app
        generarNumerosAleatorios()
    }

    fun generarNumerosAleatorios() {
        // Generar dos números aleatorios entre 0 y 9
        val numero1 = Random.nextInt(0, 10)
        val numero2 = Random.nextInt(0, 10)

        // Calcular la suma
        val resultado = numero1 + numero2

        // Asignar los textos con el nombre del número
        enlace3.textNumero1.text = getNombreNumero(numero1)
        enlace3.textNumero2.text = getNombreNumero(numero2)
        enlace3.textResultado.text = getNombreNumero(resultado)

        // Asignar las imágenes correspondientes
        enlace3.imageView1.setImageResource(getImageResource(numero1))
        enlace3.imageView2.setImageResource(getImageResource(numero2))
        enlace3.imageViewResultado.setImageResource(getImageResource(resultado))
    }

    fun getImageResource(numero: Int): Int {
        return when (numero) {
            0 -> R.drawable.ceroo
            1 -> R.drawable.uno
            2 -> R.drawable.doss
            3 -> R.drawable.tress
            4 -> R.drawable.cuatroo
            5 -> R.drawable.cincoo
            6 -> R.drawable.seiss
            7 -> R.drawable.siete
            8 -> R.drawable.ocho
            9 -> R.drawable.nueve
            10 -> R.drawable.diez
            11 -> R.drawable.once
            12 -> R.drawable.doce
            13 -> R.drawable.trece
            14 -> R.drawable.catorce
            15 -> R.drawable.quince
            16 -> R.drawable.dieciseis
            17 -> R.drawable.diecisiete
            18 -> R.drawable.dieciocho
            else -> R.drawable.ceroo // Imagen por defecto
        }
    }

    fun getNombreNumero(numero: Int): String {
        return when (numero) {
            0 -> "cero"
            1 -> "uno"
            2 -> "dos"
            3 -> "tres"
            4 -> "cuatro"
            5 -> "cinco"
            6 -> "seis"
            7 -> "siete"
            8 -> "ocho"
            9 -> "nueve"
            10 -> "diez"
            11 -> "once"
            12 -> "doce"
            13 -> "trece"
            14 -> "catorce"
            15 -> "quince"
            16 -> "dieciséis"
            17 -> "diecisiete"
            18 -> "dieciocho"
            else -> "desconocido"
        }
    }
}