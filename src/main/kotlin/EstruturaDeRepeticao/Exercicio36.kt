package EstruturaDeRepeticao

import java.util.Scanner

fun main() {
    val entrada = Scanner(System.`in`)
    println("Insira um valor: ")
    val x = entrada.nextInt()
    println("Insira o valor inical da tabuada: ")
    var indice = entrada.nextInt()
    println("Insira o valor final da tabuada: ")
    var num = entrada.nextInt()

    while(indice < num+1){
        var tabuada = x;
        tabuada = tabuada * indice
        println("$x X $indice = $tabuada")
        indice++
    }
}