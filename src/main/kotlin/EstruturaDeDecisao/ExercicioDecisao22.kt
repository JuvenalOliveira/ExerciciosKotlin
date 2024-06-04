package EstruturaDeDecisao

import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)

    println("Insira um valor")
    var x = entrada.nextInt()

    if(x % 2 == 0){
        println("O número é par")
    } else {
        println("O número é impar")
    }
}