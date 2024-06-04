package org.example.ExerciciosComString
import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)
    var indice = 0;
    while(indice != 1) {
        println("Insirar seu CPF no formato xxx.xxx.xxx-xx")
        val cpf = entrada.nextLine()
        if (cpf.length > 14 || cpf.length < 14) {
            println("Informe um CPF valido! ")
            indice = -1
        }
        if (cpf.contains('.') == false) {
            println("Você esqueceu de acrescentar os pontos(.)")
        } else if (cpf.contains('-') == false) {
            println("Você esqueceu de acrescentar o traço(-)")
            indice = -1
        }else {
            println("CPF-$cpf Cadastrado com sucesso! ")
        }
        indice++
    }
}