package org.example
import java.util.Scanner


fun main(){
    val entrada = Scanner(System.`in`)
    println("Insira a primeira nota do aluno: ")
    val x = entrada.nextInt()
    println("Insira a segunda nota do aluno: ")
    val y = entrada.nextInt()
    val media = (x + y) / 2

    if(media < 7){
        println("Reprovado")
    } else if(media == 10) {
        println("Parabens! media maxima alcançada")
    } else {
        println("Aprovado")

    }
}