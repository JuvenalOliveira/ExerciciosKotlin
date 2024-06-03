package org.example
import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)
    println("Insira o primeiro numero")
    val x = entrada.nextDouble()
    println("Insira o segundo numero")
    val y = entrada.nextDouble()
    println("Insira o terceiro numero")
    val z = entrada.nextDouble()

    if(x > y && x > z){
        println("O maior numero é [$x]")
    } else if(y > x && y > z){
        println("O maior numero é [$y]")
    } else if(z > x && z > y){
        println("O maior numero é [$z]")
    }
}