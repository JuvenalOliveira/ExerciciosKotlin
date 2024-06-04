package EstruturaDeDecisao

import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)
    println("Insira um valor: ")
    var x = entrada.nextDouble()

    if(x % 1 == 0.0){
        println("O numero inserido é inteiro")
    } else {
        println("O numero inserido é decimal")
    }
}
