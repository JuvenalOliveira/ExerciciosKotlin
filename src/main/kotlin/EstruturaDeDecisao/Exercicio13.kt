package org.example
import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)
    println("Insira um número: ")
    var x = entrada.nextInt()

           if(x == 1 || x == 8 || x == 15 || x == 22 || x == 29){
        println("$x-Domingo")
    } else if(x == 2 || x == 9 || x == 16 || x == 23 || x == 30){
        println("$x-Segunda")
    } else if(x == 3 || x == 10 || x == 17 || x == 24 || x == 31){
        println("$x-Terça")
    } else if(x == 4 || x == 11 || x == 18 || x == 25){
        println("$x-Quarta")
    } else if(x == 5 || x == 12 || x == 19 || x == 26){
        println("$x-Quinta")
    } else if(x == 6 || x == 13 || x == 20 || x == 27){
        println("$x-Sexta")
    } else if(x == 7 || x == 14 || x == 21 || x == 28){
        println("$x-Sabado")
    } else {
        println("Insira um valor valido: ")
           }
}
