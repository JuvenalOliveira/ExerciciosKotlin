package org.example.ExerciciosFuncao

import kotlin.random.Random

fun main() {
    var indice = 1
    var ponto = 0
    var resultado: Int
    var contador = 1

    while (indice != 0) {
        println("Jogada ($indice): ")
        resultado = lancarDado()
        ponto = jogoCraps(resultado, contador)

        if (ponto == 7 || ponto == 11) {
            indice = 0
        } else if (ponto == 2 || ponto == 3 || ponto == 12) {
            indice = 0
        } else if (ponto in 4..6 || ponto in 8..10) {
            while (true) {
                resultado = lancarDado()
                if (jogoContinuacao(ponto, contador, resultado)) {
                    indice = 0
                    break
                }
                contador++
                indice++
            }
        }
    }
}

fun lancarDado(): Int {
    val dado1D6 = Random.nextInt(1, 7)
    val dado2D6 = Random.nextInt(1, 7)
    val soma = dado1D6 + dado2D6
    println("Lançou os dados: $dado1D6 + $dado2D6 = $soma")
    return soma
}

fun jogoCraps(x: Int, contador: Int): Int {
    println("Rodada ($contador)")
    return when {
        contador == 1 && (x == 7 || x == 11) -> {
            println("Você ganhou! Você tirou o valor $x")
            7
        }
        contador == 1 && (x == 2 || x == 3 || x == 12) -> {
            println("Você perdeu! Você tirou o valor $x")
            2
        }
        contador == 1 && (x in 4..6 || x in 8..10) -> {
            println("O seu ponto é $x. Para vencer, você precisa tirar o mesmo valor novamente.")
            x
        }
        else -> x
    }
}

fun jogoContinuacao(ponto: Int, contador: Int, d6: Int): Boolean {
    println("Rodada ($contador)")
    return when {
        d6 == 7 -> {
            println("Você perdeu! Você tirou o valor 7.")
            true
        }
        d6 == ponto -> {
            println("Você venceu! Você tirou o valor $ponto novamente.")
            true
        }
        else -> {
            println("Rodada continua. Você tirou o valor $d6.")
            false
        }
    }
}
