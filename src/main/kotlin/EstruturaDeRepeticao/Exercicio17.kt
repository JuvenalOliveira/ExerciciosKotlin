package EstruturaDeRepeticao

import java.util.Scanner

fun main() {
    val entrada = Scanner(System.`in`)

    var indice = 1;

    println("Insira o numero que deseja fatorar: ")
    var x = entrada.nextInt()
    var y = x;
    var x1 = x;

    print("$x!=$x.")
    while(indice < x){
    y -= 1
    print("$y.")
        x1 = x1 * y;
        indice++
    }
    print("=$x1")
}