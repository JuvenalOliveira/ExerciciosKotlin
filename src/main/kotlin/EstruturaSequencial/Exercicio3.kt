package org.example
import java.util.Scanner;

fun main(){
    val entrada = Scanner(System.`in`);

    println("Insira o primeiro valor: ");
    val x = entrada.nextInt();
    println("Insira o segundo valor: ");
    val y = entrada.nextInt();

    val total = x + y;

    println("O resultado da soma é: $total");


}
