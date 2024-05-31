package EstruturaDeRepeticao

import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)

    println("Insira a quantidade de series a ser imprimida: ")
    val x = entrada.nextInt()
    var indice = 1.0
    var auxiliar = 1.0
    var H = 1.0
    var num = 0.0

    print("H = 1 + ")
    while(indice < x + 1){
        print("$auxiliar/$indice + ")
        num = 1 / indice
        H = H + num
        indice++
    }
    println()
    println("O valor final de S com $x repetições é: $H")
}
