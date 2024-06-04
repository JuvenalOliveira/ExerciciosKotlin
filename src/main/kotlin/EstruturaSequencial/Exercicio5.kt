package org.example
import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`);
    println("Insira a quantidade de metros para conversão: ");
    val metro = entrada.nextInt();

    val cm = metro * 100;

    println("Resultado: $cm cm");

}
