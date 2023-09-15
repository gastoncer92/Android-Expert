package com.gastondevs.cursoandroid.TODOapp2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CatagoriaAdapter (private val categorias:List<TaskCatgorias>):
    RecyclerView.Adapter<CategoriasViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriasViewHolder {
        val view = LayoutInflater.from(parent.context)
    }

    override fun onBindViewHolder(holder: CategoriasViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount() = categorias.size

}