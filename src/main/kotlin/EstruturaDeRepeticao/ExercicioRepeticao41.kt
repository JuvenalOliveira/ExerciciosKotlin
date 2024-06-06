package EstruturaDeRepeticao

import java.util.Scanner

fun main() {
    val entrada = Scanner(System.`in`)
    println("Informe o valor da divida: ")
    var divida = entrada.nextDouble()
    println("Informe o numero de parcelas: ")
    var parcela = entrada.nextDouble()
    println("Informe o valor do juros a ser cobrado: ")
    var juros = entrada.nextDouble()

    var x = 0.0;
    var y = 0.0;
    var z = 0.0;

    var indice = 1;

    println("Valor da dívida Valor dos Juros Quantidade de parcelas Valor da Parcela")
    while (indice < parcela) {
        if (parcela > 1) {
            x = divida * (juros / 100)
            y = x / parcela
            println("$divida    $x    $indice    $y")
            divida += x
        } else{
            x = divida * (juros / 100)
            y = x / 1
            println("$divida    $x    $indice    $y")
            divida += x
        }
        indice++
    }
}