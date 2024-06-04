package org.example.ExerciciosFuncao

fun main() {
    val resultado = soma(10, 20, 30)
    println("Resultado da soma: $resultado")
}

fun soma(x: Int, y: Int, z: Int): Int {
    val soma = x + y + z
    return soma
}
