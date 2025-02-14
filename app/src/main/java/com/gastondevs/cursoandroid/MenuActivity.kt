package com.gastondevs.cursoandroid

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.aristidevs.androidmaster.R
import com.aristidevs.androidmaster.firstapp.FirstAppActivity
import com.gastondevs.cursoandroid.TODOapp2.TodoActivity
import com.gastondevs.cursoandroid.calculadoraimc.CalculadoraImcActivity
import com.gastondevs.cursoandroid.holapp.HolaActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu3)

        val btnHolApp = findViewById<Button>(R.id.btnHolApp)
        val btnCalculadoraImc = findViewById<Button>(R.id.btnCalculadoraImc)
        val btnTodoApp2 = findViewById<Button>(R.id.btnTodoApp2)


        btnHolApp.setOnClickListener { navegarHolaActivity() }
        btnCalculadoraImc.setOnClickListener { navegarCalculadoraImcActivity() }
        btnTodoApp2.setOnClickListener { navegarTodoActivity() }
    }

    private fun navegarTodoActivity() {
        val intent = Intent(this, TodoActivity::class.java)
        startActivity(intent)
    }

    private fun navegarHolaActivity() {
        val intent = Intent(this, HolaActivity::class.java)
        startActivity(intent)
    }

//    private fun navigateToSaludApp(){
//        val intent = Intent(this, FirstAppActivity::class.java)
//        startActivity(intent)
//    }


    private fun navegarCalculadoraImcActivity() {
        val intent = Intent(this, CalculadoraImcActivity::class.java)
        startActivity(intent)
    }


}