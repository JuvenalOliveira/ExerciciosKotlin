package org.example
import java.util.Scanner

fun main(){
    val leitor = Scanner(System.`in`);
    println("Insira a temperatura em Fahrenheit");
    val x = leitor.nextDouble();

    val y = (x-32) / 1.8;

    println("A temperatura em graus Celsius é: $y");

}