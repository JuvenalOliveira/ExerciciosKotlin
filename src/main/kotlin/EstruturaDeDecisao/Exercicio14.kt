package org.example
import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)
    println("Insira a primeira nota do(a) aluno(a)")
    val x = entrada.nextDouble()
    println("Insira a segunda nota do(a) aluno(a)")
    val y = entrada.nextDouble()

    val media = (x + y) / 2

    if(media >= 9 && media <=10){
        println("A")
    } else if(media >= 7.5 && media <9){
        println("B")
    } else if(media >= 6 && media <7.5){
        println("C")
    } else if(media >=4 && media < 6) {
        println("D")
    } else {
            println("E")
        }
    }
