package EstruturaDeRepeticao

import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)

    println("Insira quantos pães vai querer comprar: ")
    var x = entrada.nextInt()
    while (x > 50) {
        if (x < 0 || x > 50) {
            println("Valor invalido!")
            println("Insira a quantidade de caixar que será comprada: ")
            x = entrada.nextInt()
        }
    }
    println("Insira o valor do pão: ")
    var pao = entrada.nextDouble()

    var indice = 1;
    var y = 0;
    var soma = 0.0;

    while(indice < x + 1){
        soma += pao
        println("$indice - R$ $soma")
        indice++
    }
}