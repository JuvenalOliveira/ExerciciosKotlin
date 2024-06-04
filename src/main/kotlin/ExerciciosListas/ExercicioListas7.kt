package ExerciciosListas

import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)
    val tamanho = 5;
    val lista = Array(tamanho) {0}
    var soma = 0
    var mult = 1


    for (i in lista.indices){
        println("Insira os valores na lista")
        lista[i] = entrada.nextInt()
    }
    for (elemento in lista){
        soma += elemento
        mult *= elemento
    }
    println()
    println(soma)
    println(mult)
}