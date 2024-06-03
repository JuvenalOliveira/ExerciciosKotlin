package org.example
import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)
    println("Digite [F] caso for mulher")
    println("Digite [M] caso for homem")
    val x = entrada.nextLine()

    if(x == "F" || x == "f"){
        println("$x - Feminino")
    } else if(x == "M" || x == "m"){
        println("$x - Masculino")
    } else {
        println("Sexo invalido")
    }

}
