package org.example.ExerciciosClasses
import java.util.*

class ExercicioClasse2(var lado:Double){


    fun exercicio2AlterarLado():Double {
        val entrada = Scanner(System.`in`)
        println("Insirar o novo valor do lado")
        lado = entrada.nextDouble()
        return lado
    }
    fun exercicio2CalcularArea():Double{
        val area = lado * lado
        return area
    }
    fun exercicio2Imprimir(){
        println("O lado do quadrado é: $lado")
        println("A area do quadrado é: ${exercicio2CalcularArea()}")
    }
}