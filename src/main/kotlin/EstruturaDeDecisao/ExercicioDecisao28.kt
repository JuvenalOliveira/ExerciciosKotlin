package EstruturaDeDecisao

import java.util.Scanner

fun main() {
    var tipoCarne = "";
    var preco = 0.0;
    var precoDesconto = 0.0;
    var desconto = 0.0;
    var metodoDeCompra = "";

    val entrada = Scanner(System.`in`)
    println("Qual o tipo de carne deseja comprar?")
    println("(0) File Duplo")
    println("(1) Alcatra")
    println("(2) Picanha")
    val tipo = entrada.nextInt()

    println("Quantos Kg de carne vai querer?")
    val quantidade = entrada.nextDouble()

    println("Qual a forma de pagamento?")
    println("(0) Cartão Tabajara")
    println("(1) Cartão")
    println("(2) Dinheiro")

    val forma = entrada.nextInt()

    if(tipo == 0){
        if(quantidade <= 5.0){
            preco = quantidade * 4.90
            tipoCarne = "File Duplo"
        } else{
            preco = quantidade * 5.80
            tipoCarne = "File Duplo"
        }
    }

    if(tipo  == 1){
        if(quantidade <= 5.0){
            tipoCarne = "Alcatra"
            preco = quantidade * 5.90
        } else{
            tipoCarne = "Alcatra"
            preco = quantidade * 6.80
        }
    }

    if(tipo == 2){
        if(quantidade <= 5.0){
            tipoCarne = "Picanha"
            preco = quantidade * 6.90
        } else{
            tipoCarne = "Picanha"
            preco = quantidade * 7.80
        }
    }

    if(tipo > 2){
        println("Opção invalida")
    }

    if(forma == 0){
        desconto = preco * 0.05
        precoDesconto = preco - desconto;
        metodoDeCompra = "Cartão Tabajara"

        println("Tipo de carne: $tipoCarne")
        println("Preço total: $preco")
        println("Tipo de pagamento: $metodoDeCompra")
        println("Valor do desconto: $desconto")
        println("Valor a pagar: $precoDesconto")
    } else if (forma == 1){
        metodoDeCompra = "Cartão"
        println("Tipo de carne: $tipoCarne")
        println("Preço total: $preco")
        println("Tipo de pagamento: $metodoDeCompra")
        println("Valor do desconto: $desconto")
        println("Valor a pagar: $preco")
    }  else if (forma == 2){
        metodoDeCompra = "Dinheiro"
        println("Tipo de carne: $tipoCarne")
        println("Preço total: $preco")
        println("Tipo de pagamento: $metodoDeCompra")
        println("Valor do desconto: $desconto")
        println("Valor a pagar: $preco")
    } else {
        println("Opção invalida: ")
    }
}