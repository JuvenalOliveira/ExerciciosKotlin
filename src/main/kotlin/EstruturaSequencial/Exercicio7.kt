package org.example
import java.util.Scanner


fun main(){
    val entrada = Scanner(System.`in`);
    println("Insira a altura do quadrado");
    val altura = entrada.nextDouble();
    println("Insira a largura do quadrado");
    val largura = entrada.nextDouble();

    val total = (largura * altura) * 2;

    println("O total é $total");

}
