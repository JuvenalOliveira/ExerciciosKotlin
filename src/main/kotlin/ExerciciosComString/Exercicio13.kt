package org.example.ExerciciosComString
import java.util.*
import kotlin.random.Random

fun main() {
    val entrada = Scanner(System.`in`)

    val palavra = "Macarrão"
    val jogoPalavra = palavra.toList().shuffled(Random.Default)
    for(i in jogoPalavra){
        print("[$i]")
    }
    println()
    println("Insira a palavra correta")
    for(i in 1..6) {
        println("Tentativa $i")
        val palavraCorreta = entrada.nextLine()
        if(palavraCorreta == palavra){
            println("Você acertou, a palavra é $palavra")
            println("Parabens!")
            break;
        }else {
            println("Palavra Incorreta!")
        }
    }
}