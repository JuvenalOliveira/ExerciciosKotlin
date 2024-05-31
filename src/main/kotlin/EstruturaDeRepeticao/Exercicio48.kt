package EstruturaDeRepeticao

import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)
    println("Insira um valor Inteiro")
    val x = entrada.nextLine()
    val y = x.reversed()

    println("$y")
}