package EstruturaDeRepeticao

import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)

    println("Insira a quantidade de series a ser imprimida: ")
    val x = entrada.nextInt()
    var indice = 1.0
    var auxiliar = 1.0
    var S = 0.0
    var num = 0.0

    print("S = ")
    while(indice < x + 1){
        print("$indice/$auxiliar + ")
        num = indice / auxiliar
        S = S + num
        indice++
        auxiliar += 2
    }
    println()
    println("O valor final de S com $x repetições é: $S")
}
