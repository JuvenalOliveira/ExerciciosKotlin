package EstruturaDeDecisao

import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)

    var precoMorango = 0.0
    var precoMaca = 0.0
    var total = 0.0

    println("Quantos  Kg de morangos vai querer? ")
    val x = entrada.nextDouble()
        println("Quantos Kg de maçã vai querer? ")
    val y = entrada.nextDouble()


    if(x <= 5.0){
        precoMorango = x * 2.50
    } else {
        precoMorango = x * 2.20
    }


    if(y <= 5.0){
        precoMaca = y * 1.80
    } else {
        precoMaca = y * 1.50
    }

    val totalKg = x + y;
    val totalPreco = precoMaca + precoMorango;

    if(totalKg > 8.0 || totalPreco > 25.0){
    val desconto = totalPreco * 0.10
        total = totalPreco - desconto
        println("Com a compra de [$totalKg Kg] Em frutas o valor a ser pago é : [$total]")
    } else {
        println("Com a compra de [$totalKg Kg] Em frutas o valor a ser pago é : [$totalPreco]")
    }


}