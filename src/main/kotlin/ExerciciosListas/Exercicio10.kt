package ExerciciosListas

import java.util.Scanner

fun main() {
    val entrada = Scanner(System.`in`)
    val tamanho = 3

    val fila = Array(tamanho) { 0 }
    val pilha = Array(tamanho) { 0 }
    val lista = Array(fila.size + pilha.size) { 0 }

    println("Insira os valores do primeiro vetor:")
    fila.forEachIndexed { i, _ ->
        print("[$i] - ")
        fila[i] = entrada.nextInt()
    }

    println("Insira os valores do segundo vetor:")
    pilha.forEachIndexed { i, _ ->
        print("[$i] - ")
        pilha[i] = entrada.nextInt()
    }

    var x = 0
    var y = 0

   for (i in lista.indices){
       if(i % 2 == 0 && y < fila.size){
           lista[i] = fila[y]
           y++
       }else if(x < pilha.size){
           lista[i] = pilha[x]
           x++
       }
   }
    println()
    println("Terceiro vetor:")
    lista.forEachIndexed { i, value ->
        println("[$i] - $value")
    }
}
