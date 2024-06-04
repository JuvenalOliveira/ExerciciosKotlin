package org.example.ExerciciosFuncao
import kotlin.random.Random

fun main(){
    val nome = "Jotaro"
    val nomeEmbaralhado = Embaralhar(nome)
    println(nomeEmbaralhado)
}
fun Embaralhar(nome: String): String{
    val separar = nome.split("")
    val x = separar.shuffled(Random.Default)
    val nomeEmbaralhado = x.toString()
    return nomeEmbaralhado
}