package org.example
import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)

    println("Insira sua altura")
    var altura = entrada.nextDouble()
    println("Digite (0) se voce for homem e (1) caso for mulher: ")
    var sexo = entrada.nextInt()

    if(sexo == 0){
        var x = (72.7 * altura) -58
        println("O seu peso ideal é $x")
    }else if(sexo == 1){
        var y = (62.1 * altura) -44.7
        println("O seu peso ideal é $y")
    } else {
        println("O sexo inserido é invalido")
    }
}
