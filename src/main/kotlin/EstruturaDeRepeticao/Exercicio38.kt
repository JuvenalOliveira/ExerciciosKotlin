package EstruturaDeRepeticao

import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)
    var indice = 1996
    var num = 2024
    println("Insirar seu salariro: ")
    var salario = entrada.nextDouble()
    var bonus = 0.015
    var x = 0.0;
    var total  = 0.0;

    while (indice < num+1   ){
     x = salario * bonus
        total = x + salario
            bonus += bonus;
        indice++
    }
    println("Salario final em 2024: $total")
}