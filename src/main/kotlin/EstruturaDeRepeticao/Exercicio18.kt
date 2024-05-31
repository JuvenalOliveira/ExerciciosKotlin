package EstruturaDeRepeticao

import java.util.Scanner

fun main() {
    val entrada = Scanner(System.`in`)

    var indice = 1;

    var y = 0;
    var z = 1000;

    println("Quando numeros deseja inserir?")
    val n = entrada.nextInt()

    println("Insira $n valores: ")
    while(indice <= n){
        print("[$indice]- ")
        val x = entrada.nextInt()
        if(y < x){
            y = x
        } else if(z > x){
            z = x
        }
        indice++
    }
    val total = y + z

    println("O maior valor é: $y")
    println("O menor valor é: $z")
    println("A soma do maior e menor valor é: $total")
}