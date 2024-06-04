package org.example
import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)

    println("Insira o primeiro numero inteiro")
    val x = entrada.nextInt();
    println("Insira o segundo numero inteiro")
    val y = entrada.nextInt();
    println("Insira um numero real")
    val z = entrada.nextDouble();

    val a = (x * 2) + (y / 2);
    val b = (x * 3) + z;
    val c = z * z * z;

    println("A = [$a]");
    println("B = [$b]");
    println("C = [$c]");
}