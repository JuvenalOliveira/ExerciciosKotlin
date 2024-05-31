package ExerciciosListas

import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)
    val tamanho = 5;
    val lista = Array(tamanho){0}
    var x = 0;

    println("Insira os valores no vetor")
    for(i in lista.indices){
    print("[$i]- ")
        lista[i] = entrada.nextInt()
    }
    lista.forEach {elemento->
        println(elemento)
    }

    println()

    lista.forEachIndexed{ i, j ->
        lista[i] = j * j
    }
    lista.forEach {elemento->
        println(elemento)
    }
}