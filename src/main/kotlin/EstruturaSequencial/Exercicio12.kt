package org.example
import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`);
    println("Insira a sua altura: ")
    val altura = entrada.nextDouble()

    val peso = (72.7 * altura) - 58;

    println("Seu peso ideal é: $peso");
}
