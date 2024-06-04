package org.example
import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)

    println("Informe o Peso de peixe em Kg: ")
    val peso = entrada.nextDouble();

    if(peso > 50){
        val excesso = peso - 50
        val multa = excesso * 4;

        println("O peixe teve um peso excedente de: $excesso Kg")
        println("O valor da multa a ser cobrada é de: $multa RS")
    } else {
        println("O peixe este dentro do regulamento, sem multas a cobrar.")
    }
}
