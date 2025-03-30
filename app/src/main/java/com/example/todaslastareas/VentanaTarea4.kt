package com.example.todaslastareas

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.todaslastareas.databinding.ActivityVentanaTarea4Binding

class VentanaTarea4 : AppCompatActivity() {
    lateinit var imagenBraille: ImageView
    lateinit var campoRespuesta: EditText
    lateinit var botonJugar: Button
    lateinit var textoResultado: TextView
    // Variables para la imagen y respuesta correcta
    var letraActual = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val enlace4 = ActivityVentanaTarea4Binding.inflate(layoutInflater)
        setContentView(enlace4.root)

        // Mapeo de imágenes de Braille con sus nombres correctos
        val brailleMap = mapOf(
            "a" to R.drawable.a,
            "b" to R.drawable.b,
            "c" to R.drawable.c,
            "d" to R.drawable.d,
            "e" to R.drawable.e,
            "f" to R.drawable.f,
            "g" to R.drawable.g,
            "h" to R.drawable.h,
            "i" to R.drawable.i,
            "j" to R.drawable.j,
            "k" to R.drawable.k,
            "l" to R.drawable.l,
            "m" to R.drawable.m,
            "n" to R.drawable.n,
            "ñ" to R.drawable.enie,
            "o" to R.drawable.o,
            "p" to R.drawable.p,
            "q" to R.drawable.q,
            "r" to R.drawable.r,
            "s" to R.drawable.s,
            "t" to R.drawable.t,
            "u" to R.drawable.u,
            "v" to R.drawable.v,
            "w" to R.drawable.w,
            "x" to R.drawable.x,
            "y" to R.drawable.y,
            "z" to R.drawable.z,
            "0" to R.drawable.cero,
            "1" to R.drawable.unoo,
            "2" to R.drawable.dosss,
            "3" to R.drawable.tresss,
            "4" to R.drawable.cuatrooo,
            "5" to R.drawable.cinco,
            "6" to R.drawable.seis,
            "7" to R.drawable.sieteee,
            "8" to R.drawable.ochoo,
            "9" to R.drawable.nuevee
        )

        fun cargarNuevaImagen() {
            val entradaAleatoria = brailleMap.entries.random()
            letraActual = entradaAleatoria.key
            enlace4.imgBraile.setImageResource(entradaAleatoria.value)
            enlace4.txtResultado.text = ""
            enlace4.txtRespuesta.text.clear()
        }

        fun verificarRespuesta() {
            val respuestaUsuario = enlace4.txtRespuesta.text.toString().trim().lowercase()
            if (respuestaUsuario == letraActual) {
                enlace4.txtResultado.text = "¡Correcto!"
            } else {
                enlace4.txtResultado.text = "Incorrecto, inténtalo de nuevo."
            }
        }


        enlace4.btnVerificar.setOnClickListener {
            verificarRespuesta()
        }

        cargarNuevaImagen()
    }

}