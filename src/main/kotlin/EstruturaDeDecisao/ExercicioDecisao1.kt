package org.example
import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)
    println("Insira um valor")
    val x = entrada.nextDouble()
    println("INsira um segundo valor")
    val y = entrada.nextDouble()

    if(x > y){
        println("O maior numero inserido é: $x")
    } else {
        println("O maior numero inserido é: $y")
    }
}