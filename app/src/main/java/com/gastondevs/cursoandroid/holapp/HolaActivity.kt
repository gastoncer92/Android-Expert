package com.gastondevs.cursoandroid.holapp

import android.content.Intent
import android.widget.Button
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.aristidevs.androidmaster.firstapp.ResultActivity
import com.aristidevs.androidmaster.R

class HolaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hola)
        val botonHola = findViewById<Button>(R.id.btnIngresar)
        val etNombre = findViewById<AppCompatEditText>(R.id.etNombre)

        botonHola.setOnClickListener {
            val name = etNombre.text.toString()

            if (name.isNotEmpty()) {
                val intent = Intent(this, ResultActivity2::class.java)
                intent.putExtra("EXTRA_NAME", name)
                startActivity(intent)
            }
        }

    }
}


//class FirstAppActivity : AppCompatActivity() {
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_first_app)
//        val btnStart = findViewById<AppCompatButton>(R.id.btnStart)
//        val etName = findViewById<AppCompatEditText>(R.id.etName)
//
//        btnStart.setOnClickListener {
//            val name = etName.text.toString()
//            if (name.isNotEmpty()) {
//                val intent = Intent(this, ResultActivity::class.java)
//                intent.putExtra("EXTRA_NAME", name)
//                startActivity(intent)
//            }
//        }
//////        Al arrancar la pantalla
//    }
//}