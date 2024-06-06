package EstruturaDeRepeticao

import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)

    println("Insira a quantidade total de notas")
    var x = entrada.nextInt()
    println("Insira $x valores")
    var indice = 1;
    var y = 0;
    var soma = 0;
    var divisao = 0;

    while(indice < x + 1){
    print("($indice)- ")
    y = entrada.nextInt()
        soma += y
        indice++
    }
    divisao = soma / x

    println("A média é $divisao")
}