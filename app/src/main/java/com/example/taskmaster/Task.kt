package com.example.taskmaster

// TEMA 2: Componentes definidos por el usuario
// Data class simple (sin Room/Base de datos)
data class Task(
    val id: Int,
    val title: String,
    val description: String,
    val isCompleted: Boolean = false
)