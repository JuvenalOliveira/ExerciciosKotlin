package ExerciciosListas

import java.util.Scanner

fun main() {
    val entrada = Scanner(System.`in`)
    val tamanho = 2
    val idade = Array(tamanho) { 0 }
    val altura = Array(tamanho) { 0.0 }
    var y = 0

    while (y < tamanho) {
        println("Insira sua idade ($y):")
        idade[y] = entrada.nextInt()

        println("Insira sua altura ($y):")
        altura[y] = entrada.nextDouble()

        y++
    }

    println("Idades e alturas inseridas:")
    for (i in tamanho -1 downTo 0){
        println("Idade: ${idade[i]}, Altura: ${altura[i]}")
    }
}
