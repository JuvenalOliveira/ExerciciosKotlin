package org.example
import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)
    println("Insira um valor")
    val x = entrada.nextDouble()

    if(x < 0){
        println("O numero [$x] é negativo")
    } else {
        println("O numero [$x] é positivo")
    }

}
