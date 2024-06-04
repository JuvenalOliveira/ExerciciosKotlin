package org.example
import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)

    var indice = 0
    while(indice != 1){
        print("Insira seu usuario: ")
        val usuario = entrada.nextLine()
        print("Insira sua senha: ")
        val senha = entrada.nextLine()

        if(usuario == senha){
            println("Usuario e Senha não podem ser as mesmas!")
        } else {
            indice++
        }
    }
}