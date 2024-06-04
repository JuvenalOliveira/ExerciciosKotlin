package org.example.ExerciciosFuncao
import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)
    println("Insira um valor Inteiro")
    val x = entrada.nextInt()
    println("Insira o valor da taxa")
    val y = entrada.nextDouble() / 100

    somaImposto(y, x)
}
fun somaImposto(taxaImposto: Double, custo: Int):Double{
println("Valor da compra: $custo")
val x = custo * taxaImposto
    val total = custo + x
    println("O valor com o imposto é: $total")
    return total;
}