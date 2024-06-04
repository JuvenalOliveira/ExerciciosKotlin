package org.example.ExerciciosComString
import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)
    println("Insira seu nome: ")
    val nome = entrada.nextLine()

    val nomeSeparado = nome.split("")
nomeSeparado.forEach(){i->
    println(i.uppercase())
}
}