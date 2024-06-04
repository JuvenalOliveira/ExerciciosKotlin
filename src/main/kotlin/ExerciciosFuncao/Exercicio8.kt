package org.example.ExerciciosFuncao
import java.util.Scanner

fun main(){
val entrada = Scanner(System.`in`)
    println("Insira algum valor numerico: ")
    val digitos = entrada.nextInt()
    modificar(digitos)
}
fun modificar(x: Int):Int{
    val modificar = x.toString()
    val tamanho = modificar.count()
    println(tamanho)

    return tamanho
}