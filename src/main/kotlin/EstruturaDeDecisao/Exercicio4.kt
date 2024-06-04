package org.example
import java.util.Scanner

fun main() {
    val entrada = Scanner(System.`in`)
    println("Insira uma letra")
    val x = entrada.nextLine()

    if (x == "a" || x == "e" || x == "i" || x == "o" || x == "u") {
        println("A letra [$x] é uma vogal")
    } else if (x == "A" || x == "E" || x == "I" || x == "O" || x == "U") {
        println("A letra [$x] é uma vogal")
    } else {
        println("A letra [$x] é uma consoante")
    }
}