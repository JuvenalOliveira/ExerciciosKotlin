package org.example.ExerciciosFuncao

fun main(){
    val lista = arrayOf(10, 20, 30)
    soma(lista)
}
fun soma(lista: Array<Int>){
val soma = lista.sumOf { it }
    println(soma)
}