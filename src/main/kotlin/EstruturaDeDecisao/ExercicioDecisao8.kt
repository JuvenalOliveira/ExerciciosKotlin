package org.example
import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)

    println("Informe o preço do produto 1")
    val x = entrada.nextDouble()
    println("Informa o preço do produto 2")
    val y = entrada.nextDouble()
    println("Informe o preço do produto 3")
    val z = entrada.nextDouble()

    if(x < y && x < z){
        println("O produto 1 deve ser levado, por ter o menos preço: [$x]")
    } else if(y < x && y < z){
        println("O produto 2 deve ser levado, por ter o menos preço: [$y]")
    } else if(z < x && z < y) {
        println("O produto 3 deve ser levado, por ter o menos preço: [$z]")
    }
}