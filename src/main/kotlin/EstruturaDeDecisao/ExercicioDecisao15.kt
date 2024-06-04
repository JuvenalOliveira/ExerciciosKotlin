package org.example
import java.util.Scanner;

fun main(){
    val entrada = Scanner(System.`in`)
    println("Insira o valor dos 3 lados do triangulo")
    print("[1]: ");
    val x = entrada.nextDouble();
    print("[2]: ");
    val y = entrada.nextDouble();
    print("[3]: ");
    val z = entrada.nextDouble();

        if (x + y > z && x + z > y && y + z > x) {
            print("Triângulo ")

            if (x == y && x == z) {
                print("Equilátero")
            } else if (x == y || y == z || x == z) {
                print("Isósceles")
            } else {
                print("Escaleno")
            }
        } else {
            print("Os comprimentos fornecidos não formam um triângulo.")
        }
    }