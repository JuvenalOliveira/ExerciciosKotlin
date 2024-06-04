package org.example.ExerciciosClasses
import java.util.*

class ExercicioClasse3(var base: Int, var altura: Int){

    var area = 0;
    var perimetro = 0;

    fun exercicio3Retornar(){
        val entrada = Scanner(System.`in`)
        println("Alterar valor da base: ")
        base = entrada.nextInt()
        println("Alterar valor da altura")
        altura = entrada.nextInt()
        area = exercicio3CalcularArea(base, altura)
        perimetro = exercicio3CalcularPerimetro(base, altura)
    }
    fun exercicio3CalcularArea(base: Int, altura: Int): Int {
        area = base * altura
        return area
    }
    fun exercicio3CalcularPerimetro(base: Int, altura: Int): Int{
        perimetro = (base * 2) + (altura * 2)
        return perimetro
    }
    fun exercicio3Imprimir(){
        println("Base: $base")
        println("Altura: $altura")
        println("Area: $area")
        println("Perimetro: $perimetro")
    }
}