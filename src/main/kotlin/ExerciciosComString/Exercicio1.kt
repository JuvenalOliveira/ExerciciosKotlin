package org.example.ExerciciosComString

fun main() {

    val nome = "Brasil Hexa"
    val apelido = "Brasil! Hexa!"

    comparar(nome, apelido)
}

fun comparar(x: String, y: String):Boolean{
println("Nome: $x")
    println("Apelido: $y")
        val tamanhoX = x.count()
        val tamanhoY = y.count()
    println("Tamanho da String 1: $tamanhoX")
    println("Tamanho da String 2: $tamanhoY")
    if(tamanhoX == tamanhoY){
        println("Ambas Strings possuem o mesmo tamanho. ")
    } else {
        println("As String possuem tamanhos diferentes. ")
    }
    val conferirNome = y.contains("Hexa")
    if(conferirNome == true){
        println("As String possuem o mesmo assunto. ")
    }
    return conferirNome
}

