package org.example
import java.util.Scanner

fun main(){
    var entrada = Scanner(System.`in`)
    println("Insira o primeiro numero")
    var x = entrada.nextDouble()
    println("Insira o segundo numero")
    var y = entrada.nextDouble()
    println("Insira o terceiro numero")
    var z = entrada.nextDouble()
    var maior = 0.0;
    var menor = 0.0;

    if(x > y && x > z){
        maior = x
    } else if(y > x && y > z){
        maior = y
    } else if(z > x && z > y) {
        maior = z
    }
    if(x < y && x < z){
        menor = x
    } else if(y < x && y < z){
        menor = y
    } else if(z < x && z < y){
        menor = z
    }
    if(maior > x && x > menor){
    println("$maior $x $menor")
    } else if(maior > y && y > menor){
        println("$maior $y $menor")
    } else if(maior > z && z > menor){
        println("$maior $z $menor")
    }
}