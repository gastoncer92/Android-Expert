package com.gastondevs.cursoandroid.TODOapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.aristidevs.androidmaster.R

class TodoActivity : AppCompatActivity() {

    private lateinit var rvCategorias: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todo2)
        initComponent()
        initUI()
    }
    private fun initComponent() {
        rvCategorias = findViewById(R.id.rvCategorias)
    }

    private fun initUI() {
        // Para que un recycle View funcione tenemos que crear un Adapter y un ViewHolder,
        // El Adapter conecta la informacion con el RecycleView
        TODO("Not yet implemented")
    }


}