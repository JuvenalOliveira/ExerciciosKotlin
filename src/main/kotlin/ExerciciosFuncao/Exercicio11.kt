package org.example.ExerciciosFuncao

fun main(){
    val data = "02/12/2024"
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