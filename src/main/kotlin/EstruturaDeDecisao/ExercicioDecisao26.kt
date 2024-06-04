package EstruturaDeDecisao

import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)

    println("Quantos litros vai querer?")
    val litros = entrada.nextDouble()
    entrada.nextLine()

    println("Qual o tipo de combustível? ")
    println("A - álcool")
    println("G - gasolina")

    var combustivel = entrada.nextLine()

    if(combustivel == "A" || combustivel == "a"){
    if(litros <= 20){
        val preco =  litros * 1.90;
        val desconto = preco * 0.03
        val total = preco - desconto
        println("O valor abastecido é de $litros Litro(s)")
        println("O total a ser pago é $total R$")
    } else {
        val preco =  litros * 1.90;
        val desconto = preco * 0.05
        val total = preco - desconto
        println("O valor abastecido é de $litros Litro(s)")
        println("O total a ser pago é $total R$")
    }
    } else if(combustivel == "G" || combustivel == "g") {
        if (litros <= 20) {
            val preco = litros * 2.50;
            val desconto = preco * 0.04
            val total = preco - desconto
            println("O valor abastecido é de $litros Litro(s)")
            println("O total a ser pago é $total R$")
        } else {
            val preco =  litros * 2.50;
            val desconto = preco * 0.06
            val total = preco - desconto
            println("O valor abastecido é de $litros Litro(s)")
            println("O total a ser pago é $total R$")
        }
        } else {
            println("Opção invalida")
        }
    }