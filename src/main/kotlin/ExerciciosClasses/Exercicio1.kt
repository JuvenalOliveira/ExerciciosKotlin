package org.example.ExerciciosClasses

class Exercicio1(val cor: String, val raio: Double, val material: String) {
    val x = 2 * Math.PI * raio

    fun exercicio1Mensagem() {
        println("A bola possui a  cor $cor ")
        println("A circuferencia da bola é $x")
        println("O material da bola é $material")
    }
}