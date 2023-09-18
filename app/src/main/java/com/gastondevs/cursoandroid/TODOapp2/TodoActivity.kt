package com.gastondevs.cursoandroid.TODOapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.aristidevs.androidmaster.R
import com.aristidevs.androidmaster.todoapp.CategoriesAdapter

class TodoActivity : AppCompatActivity() {

    // referencia al RecycleView
    private val categorias = listOf(
        TaskCatgorias.Negocios,
        TaskCatgorias.Personal,
        TaskCatgorias.Otros
    )
    private lateinit var rvCategorias: RecyclerView
    private lateinit var categoriasAdapter: CatagoriaAdapter
    private lateinit var rvTasks:

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todo2)
        // tipicos metodos para hacer aplicaciones
        initComponent()
        initUI()
    }
    private fun initComponent() {
        rvCategorias = findViewById(R.id.rvCategorias)
        rvTasks = findViewById(R.id.rvTasks)
    }
    private fun initUI() {
        // Para que un recycle View funcione tenemos que crear un Adapter y un ViewHolder,
        // El Adapter conecta la informacion con el RecycleView
        categoriasAdapter = CatagoriaAdapter(categorias)
        rvCategorias.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rvCategorias.adapter=categoriasAdapter
    }


}