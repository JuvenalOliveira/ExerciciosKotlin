package EstruturaDeRepeticao

import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)

    println("Insira a quantidade total de CDs")
    var x = entrada.nextInt()
    println("Insira os valores dos $x")
    var indice = 1;
    var y = 0;
    var soma = 0;

    while(indice < x + 1){
        print("Valor do CD[$indice]- ")
        y = entrada.nextInt()
        soma += y
        indice++
    }
    println("O valor total é $soma R$")
}