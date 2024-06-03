package org.example
import java.util.Scanner

fun main(){
   val entrada = Scanner(System.`in`)

    println("Insira a temperatura em graus Celcius")
    val x = entrada.nextDouble();

    val y = (x * 1.8) + 32;

    println("O valor da temperatura em Fahrenheit é: $y");
}