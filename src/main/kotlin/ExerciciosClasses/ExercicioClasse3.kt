package org.example.ExerciciosClasses
import java.util.*

class ExercicioClasse3(var base: Int, var altura: Int) {
    val entrada = Scanner(System.`in`)

    fun mudarBase(): Int {
        println("Insira o novo valor da base:")
        base = entrada.nextInt()
        return base
    }

    fun mudarAltura(): Int {
        println("Insira o novo valor da altura:")
        altura = entrada.nextInt()
        return altura
    }

    fun calcularArea(): Int {
        return base * altura
    }

    fun calcularPerimetro(): Int {
        return 2 * (base + altura)
    }

    fun calcularPiso(): Double {
        println("Insira o tamanho do piso em cm")
        var piso = entrada.nextDouble()

        val pisoMetros = piso / 100.0
        val areaPiso = pisoMetros * pisoMetros // Área de um piso em metros quadrados
        val quantidadePisos = (calcularArea() / 10000) / areaPiso // Quantidade de pisos necessários para cobrir a área total
        val rodape = calcularPerimetro() / pisoMetros

        return quantidadePisos + rodape
    }

    fun imprimir() {
        val quantidadePisos = calcularPiso()
        println("Pisos necessários para cobrir o chão e os rodapés: $quantidadePisos")
    }
}
