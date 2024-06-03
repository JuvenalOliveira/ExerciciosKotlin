package org.example
import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`);

    println("Insira o raio do círculo");
    val raio = entrada.nextDouble(
    );
    val pi = 3.14;
    val area = (raio * raio) * pi;

    println("O valor da area do círculo é: $area");
}
