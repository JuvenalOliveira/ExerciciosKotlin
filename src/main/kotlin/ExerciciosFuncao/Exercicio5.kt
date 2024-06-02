package org.example.ExerciciosFuncao

fun main(){
    val x = 1000
    val y = 0.05

    somaImposto(y, x)
}
fun somaImposto(taxaImposto: Double, custo: Int):Double{
println("Valor da compra: $custo")
val x = custo * taxaImposto
    val total = custo + x
    println("O valor com o imposto é: $total")
    return total;
}