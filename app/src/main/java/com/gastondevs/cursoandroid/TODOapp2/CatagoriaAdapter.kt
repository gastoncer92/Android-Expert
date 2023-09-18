package com.gastondevs.cursoandroid.TODOapp2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aristidevs.androidmaster.R

class CatagoriaAdapter (private val categorias:List<TaskCatgorias>):
    RecyclerView.Adapter<CategoriasViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriasViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_task_category, parent, false)
        return CategoriasViewHolder(view)
    }

    override fun onBindViewHolder(holder: CategoriasViewHolder, position: Int) {
        holder.render(categorias[position])
    }

    override fun getItemCount() = categorias.size

}