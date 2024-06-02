package org.example.ExerciciosComString

fun main() {

    val nome = "Brasil Hexa"
    val apelido = "Brasil! Hexa!"

    comparar(nome, apelido)
}

fun comparar(x: String, y: String){
println("Nome: $x")
    println("Apelido: $y")
        val tamanhoX = x.count()
        val tamanhoY = y.count()
    println("Tamanho do Nome: $x")
    println("Tamanho do Apelido: $y")
}

