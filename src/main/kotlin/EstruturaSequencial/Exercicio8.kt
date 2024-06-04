package org.example
import java.util.Scanner;

fun main(){
    val entrada = Scanner(System.`in`);

    println("Quantos voce ganha por hora trabalhada? ")
    val x = entrada.nextDouble();
    println("Quantas horas você trabalha por mês? ")
    val y = entrada.nextInt();

    val salario = x * y;

    println("O salario recebido é $salario");
}

