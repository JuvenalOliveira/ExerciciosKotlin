package org.example.ExerciciosComString
import java.util.*

fun main(){
val entrada = Scanner(System.`in`)
    var telefone = entrada.nextLine()
    val verificar = telefone.contains("-")

    if(verificar == false){
val formatarNumero = "${telefone.substring(0, 3)}-${telefone.substring(3)}"
     telefone = formatarNumero
    }
    if(telefone.length == 9){
        println("Numero de telefone Correto: ")
        println(telefone)
    }else if(telefone.length == 8){
        println("Numero de telefone formatado: ")
        print("3")
        println(telefone)
    }else {
        println("Numero de telefone Invalido")
    }
}