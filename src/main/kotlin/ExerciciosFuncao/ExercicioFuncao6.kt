package org.example.ExerciciosFuncao
import java.util.Scanner
import java.text.SimpleDateFormat


fun main() {
    val entrada = Scanner(System.`in`)
    println("Informe o horario atual na formatação HH:mm")
    val hora = entrada.nextLine()
    val x = converterHora(hora)
    println(x)
}

fun converterHora(hora: String): String {
    val formato24 = SimpleDateFormat("HH:mm")
    val formato12 = SimpleDateFormat("h:mma")

    val y = formato24.parse(hora)
    return formato12.format(y)
}
