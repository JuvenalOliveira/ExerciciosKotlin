package org.example.ExerciciosClasses
import java.util.*

class ExercicioClasse4(val nome: String, var idade: Int, var peso: Double, var altura: Double){
    val entrada = Scanner(System.`in`)

    fun envelhecer(){
    idade++
        crescer()
    }
    fun engordar():Double{
        println("Quantos KG o $nome engordou?")
        val x = entrada.nextDouble()
        peso += x
        return x
    }
    fun emagrecer():Double{
        println("Quantos KG o $nome emagreceu?")
        val y = entrada.nextDouble()
        peso -= y
        println()
        return y
    }
    private fun crescer(): Double {
        if (idade > 20) {
            println("O $nome não cresce mais")
        } else {
            altura += 0.05
        }
        return altura;
    }
    fun imprimirPessoa(){
        println("Nome: $nome")
        println("Idade: $idade")
        println("Peso: $peso")
        println("Altura: $altura")
    }
}