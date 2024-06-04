package org.example.ExerciciosComString
import java.util.Scanner

fun main() {
    val entrada = Scanner(System.`in`)
    println("Insira seu nome: ")
    val nome = entrada.nextLine()

    val nomeSeparado = nome.split("").filter {it.isNotEmpty() }
    val lista = arrayListOf<String>()
    for(i in nomeSeparado){
        lista.add(i.uppercase())
        println(lista)
    }
    for(i in nome.indices) {
        println(nome.uppercase().substring(0 ,i + 1))
    }
}