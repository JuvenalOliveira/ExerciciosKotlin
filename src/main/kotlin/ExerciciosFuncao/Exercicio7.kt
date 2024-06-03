package org.example.ExerciciosFuncao
import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)
    var indice = 0
    while(indice != 1) {
        println("Informe o valor da prestação")
        val prestacao = entrada.nextDouble()
        println("Informe os dias de de atraso")
        val dias = entrada.nextInt()

        val custo = valorPagamento(prestacao, dias)

        println("O valor a ser pago é $custo")
        println("Deseja sair do programa?")
        println()
        println("Digite (1) Sim")
        println("Digite (0) Não")
        indice = entrada.nextInt()
    }
}

fun valorPagamento(x: Double, y: Int):Double{
    var total = x
    if(y > 0) {
        val multa = x * 0.03
        val taxa = x * 0.01 * y
        total = total + multa + taxa
    }
    return total
}