package EstruturaDeDecisao

import java.util.Scanner
import kotlin.math.sqrt

fun main(args: Array<String>) {
    val entrada = Scanner(System.`in`)

    println("Insira o valor de A")
    var a = entrada.nextDouble()
    if (a == 0.0){
        println("valor informado inválido")
        println("Encerrando o programa...")
        return;
    }
    println("Insira o valor de B")
    val b = entrada.nextDouble()
    println("Insira o valor de C")
    val c = entrada.nextDouble()
    var delta = 0.0;
    delta = (b * b) - 4 * a * c;
    if(delta < 0){
        println("O valor de delta[$delta] é negativo, não possuindo raizes reais")
        println("Encerrando o programa...")
        return;
    }
    if(delta == 0.0){
        println("A raiz de Delta é: $delta")
    }
    val raizQuadrada = sqrt(delta)

    val x = (-b + raizQuadrada) / (2 * a)
    val y = (-b - raizQuadrada) / (2 * a)

    println(x);
    println(y);
}