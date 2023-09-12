package com.gaston

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.aristidevs.androidmaster.R

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app2)
        val btnStart = findViewById<AppCompatButton>(R.id.btnStart)
        val etName1 = findViewById<AppCompatEditText>(R.id.etName1)



        btnStart.setOnClickListener {
            Log.i("AristiDevs", "Boton precionado ${etName1.text.toString()}")
        }




    }
}