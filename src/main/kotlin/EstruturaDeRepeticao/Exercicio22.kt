package EstruturaDeRepeticao

import java.util.Scanner

fun main() {
    println("Insira um numero")
    val entrada = Scanner(System.`in`)
    var x = entrada.nextInt()

    var indice = 1;
    var contador = -1;

    println("O número é divisivel por: ")
    while (indice < x + 1) {

        if (x % indice == 0) {
            print("$indice ")
            contador++
        }
        indice++
    }
    if(contador == 1 || x == 1){
        println()
        println("O numero é primo")
    } else{
        println()
        println("O numero não é primo")
    }
}
