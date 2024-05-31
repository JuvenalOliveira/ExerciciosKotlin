package EstruturaDeRepeticao

import java.util.Scanner

fun main() {
    val entrada = Scanner(System.`in`)
    println("Insira um valor: ")
    val x = entrada.nextInt()
    var indice = 1;

    while(indice < 11){
        var tabuada = x;
        tabuada = tabuada * indice
        println("$x X $indice = $tabuada")
        indice++
    }
}