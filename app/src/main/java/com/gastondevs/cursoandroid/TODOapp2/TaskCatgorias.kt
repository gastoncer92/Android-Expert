package com.gastondevs.cursoandroid.TODOapp2

sealed class TaskCatgorias {
    object Personal : TaskCatgorias()
    object Negocios : TaskCatgorias()
    object Otros : TaskCatgorias()
}

