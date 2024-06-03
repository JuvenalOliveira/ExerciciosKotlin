package org.example.ExerciciosComString

import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)
    println("Insira seu nome")
    val nome = entrada.nextLine()
    val tamanho = nome.count()

    for(i in tamanho downTo 1)
        println(nome.substring(0, i))
}