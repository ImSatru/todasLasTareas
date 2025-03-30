package com.example.todaslastareas

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.todaslastareas.databinding.ActivityVentanaTarea6Binding
import kotlin.math.sqrt

class VentanaTarea6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val enlace7 = ActivityVentanaTarea6Binding.inflate(layoutInflater)

        setContentView(enlace7.root)

        enlace7.btnCalcular.setOnClickListener {
            calcularResultado(enlace7)
        }


    }
    private fun calcularResultado(enlace: ActivityVentanaTarea6Binding) {
        val numA = enlace.numeroA.text.toString().toDoubleOrNull()
        val numB = enlace.numeroB.text.toString().toDoubleOrNull()
        val numC = enlace.numeroC.text.toString().toDoubleOrNull()

        // Verificar si los números ingresados son válidos
        if ((enlace.checkA.isChecked && numA == null) ||
            (enlace.checkB.isChecked && numB == null) ||
            (enlace.checkC.isChecked && numC == null)
        ) {
            enlace.resultado.setText("Error: Ingresa valores válidos")
            return
        }

        // Lista con los números seleccionados
        val seleccionados = mutableListOf<Double>()
        if (enlace.checkA.isChecked) numA?.let { seleccionados.add(it) }
        if (enlace.checkB.isChecked) numB?.let { seleccionados.add(it) }
        if (enlace.checkC.isChecked) numC?.let { seleccionados.add(it) }

        // Verificar si se seleccionó al menos un número
        if (seleccionados.isEmpty()) {
            enlace.resultado.setText("Error: Selecciona al menos un número")
            return
        }

        val resultado = when {
            enlace.rbSuma.isChecked -> seleccionados.sum()
            enlace.rbResta.isChecked -> seleccionados.reduce { acc, d -> acc - d }
            enlace.rbMultiplicacion.isChecked -> seleccionados.reduce { acc, d -> acc * d }
            enlace.rbDivision.isChecked -> {
                if (seleccionados.contains(0.0)) "Error: División por cero"
                else seleccionados.reduce { acc, d -> acc / d }
            }
            enlace.rbRaiz.isChecked -> {
                if (seleccionados.size >= 2) sqrt(seleccionados[1] + seleccionados.last())
                else "Error: Selecciona al menos dos números"
            }
            enlace.rbMayor.isChecked -> seleccionados.maxOrNull() ?: "Error"
            enlace.rbMenor.isChecked -> seleccionados.minOrNull() ?: "Error"
            else -> "Error: Selecciona una operación"
        }

        enlace.resultado.setText(resultado.toString())
    }
}