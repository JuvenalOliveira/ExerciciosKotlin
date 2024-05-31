package EstruturaDeRepeticao

import java.util.Scanner

fun main() {
    val entrada = Scanner(System.`in`)

    var indice = 1;

    var y = 0;
    var z = 0;

    println("Insira 10 valores: ")
    while(indice < 11){
        print("[$indice]- ")
        val x = entrada.nextInt()

        if(x % 2 == 0){
            y++
        } else {
            z++
        }
        indice++
    }
    println("Dentre os 10 valores, existe $y numeros pares e $z numeros impares");
}