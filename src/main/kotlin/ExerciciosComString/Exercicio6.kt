package org.example.ExerciciosComString
import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)
    println("Insira sua data de nascimento no formato DD/MM/AAAA")
    val data = entrada.nextLine()
    val mesConvertido = formatarData(data)

    println(mesConvertido)
}
fun formatarData(data:String):String{
    val dividir = data.split("/")
    val dia = dividir[0]
    val mes = dividir[1].toInt()
    val ano =  dividir[2]

    val mesExtenso = when (mes){
        1->  "Janeiro"
        2->  "Fevereiro"
        3-> "Março"
        4-> "Abril"
        5-> "Maio"
        6-> "Junho"
        7-> "Julho"
        8-> "Agosto"
        9-> "Setembro"
        10-> "Outubro"
        11-> "Novembro"
        else -> "Dezembro"
    }
    return "$dia/$mesExtenso/$ano"
}