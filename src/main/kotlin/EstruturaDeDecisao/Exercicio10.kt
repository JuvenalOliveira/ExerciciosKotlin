package org.example
import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)
    println("Em que tuno você estuda? ")
    println("(M)-matituno")
    println("(V-vespertino")
    println("(N)-noturno")
    val comprimento = entrada.nextLine()

    if(comprimento == "M" || comprimento == "m"){
        println("Bom Dia!")
    } else if(comprimento == "V" || comprimento == "v"){
        println("Boa Tarde!")
    } else if(comprimento == "N" || comprimento == "n"){
        println("Boa Noite!")
    } else {
        println("Valor inválido!")
    }

}
