package org.example
import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)

    var indice = 0;
    while(indice != 1){
    println("Insira um numero entra 0 a 10")
        val x = entrada.nextInt()
        if(x > 10 || x < 0){
            println("Numero inserido invalido\n")
        }else {
            indice++
        }
    }

}