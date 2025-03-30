package com.example.todaslastareas

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.todaslastareas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var tarea1: Button
    lateinit var tarea2: Button
    lateinit var tarea3: Button
    lateinit var tarea4: Button
    lateinit var tarea5: Button
    lateinit var tarea6: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val enlace = ActivityMainBinding.inflate(layoutInflater)
        tarea1 = enlace.btnTarea1
        tarea2 = enlace.btnTarea2
        tarea3 = enlace.btnTarea3
        tarea4 = enlace.btnTarea4
        tarea5 = enlace.btnTarea5
        tarea6 = enlace.btnTarea6



        tarea1.setOnClickListener{view->
            AbrirTarea1(view)
        }

        tarea2.setOnClickListener{view->
            AbrirTarea2(view)
        }
        tarea3.setOnClickListener{view->
            AbrirTarea3(view)
        }
        tarea4.setOnClickListener{view->
            AbrirTarea4(view)
        }
        tarea5.setOnClickListener{view->
            AbrirTarea5(view)
        }
        tarea6.setOnClickListener{view->
            AbrirTarea6(view)
        }



        setContentView(enlace.root)

    }

    fun AbrirTarea1(view: View){
        val op= Intent(this, VentanaTarea1::class.java)
        startActivity(op)
    }
    fun AbrirTarea2(view: View){
        val op= Intent(this, VentanaTarea2::class.java)
        startActivity(op)
    }
    fun AbrirTarea3(view: View){
        val op= Intent(this, VentanaTarea3::class.java)
        startActivity(op)
    }
    fun AbrirTarea4(view: View){
        val op= Intent(this, VentanaTarea4::class.java)
        startActivity(op)
    }
    fun AbrirTarea5(view: View){
        val op= Intent(this, VentanaTarea5::class.java)
        startActivity(op)
    }
    fun AbrirTarea6(view: View){
        val op= Intent(this, VentanaTarea6::class.java)
        startActivity(op)
    }



}