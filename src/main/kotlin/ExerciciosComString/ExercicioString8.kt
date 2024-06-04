package org.example.ExerciciosComString
import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)
    val nome = entrada.nextLine()
    val separarNome = nome.toList()
    val inverterNome = nome.reversed()
    val separarInverterNome = inverterNome.toList()
    var indice = 0;

    for(i in 0..nome.length-1){
        if(inverterNome[i] == separarNome[i]){
            indice++
        }
    }
    if(indice ==  nome.length){
        println("A palavra é um palíndromo")
    }else {
        println("A palavra não é um palíndromo")
    }
}