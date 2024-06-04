package org.example.ExerciciosClasses

fun main(){
    val bola = ExercicioClasse1("Amarelo",5.0,"Metal")
    bola.exercicio1Mensagem()
    println()
    val quadrado = ExercicioClasse2(4.0)
    quadrado.exercicio2AlterarLado()
    quadrado.exercicio2Imprimir()
    println()
    val retangulo = ExercicioClasse3(5,10)
    retangulo.exercicio3Retornar()
    retangulo.exercicio3Imprimir()
}