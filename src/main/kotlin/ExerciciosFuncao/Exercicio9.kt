package org.example.ExerciciosFuncao
import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)
    val numero = entrada.nextInt()
    val numeroReverso = inverterNumero(numero)
    println(numeroReverso)
}
fun inverterNumero(x: Int):Int{
    val converter = x.toString()
    val stringReversa = converter.reversed()
    val numeroReverso = stringReversa.toInt()
    return numeroReverso
}