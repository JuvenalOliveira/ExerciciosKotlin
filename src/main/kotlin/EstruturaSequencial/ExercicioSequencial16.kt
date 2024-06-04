package org.example
import java.util.Scanner

fun main() {
    val entrada = Scanner(System.`in`)

    println("Insira o tamanho em Metros quadrados da área a ser pintada: ")
    val area = entrada.nextDouble();
    val lata = 18;
    val preco = 80;

    val litrosNecessarios = area / 3;
    val tinta = litrosNecessarios / lata;
    val valor = tinta * 80;

    println("A quantidade de tinta que será gasta é de: $litrosNecessarios")
    println("A quantidade de lata de tinta que será necessario é de: $tinta")
    println("O valor total a ser pago é de $valor")
}