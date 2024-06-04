package org.example
import java.util.Scanner;

fun main(){
    val entrada = Scanner(System.`in`);

    println("Insira as 4 notas do aluno: ");
    val nota1 = entrada.nextDouble();
    val nota2 = entrada.nextDouble();
    val nota3 = entrada.nextDouble();
    val nota4 = entrada.nextDouble();

    val media = (nota1 + nota2 + nota3 + nota4) / 4;

    println("A média das notas do aluno é: $media");
}