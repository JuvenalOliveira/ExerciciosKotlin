package org.example
import java.util.Scanner

fun main(){
    var indice = 0;
    while(indice != 1) {
        val entrada = Scanner(System.`in`)
        println("\nInsira seus dados")
        print("Nome: ")
        val nome = entrada.nextLine()
        print("Idade: ")
        val idade = entrada.nextInt()
        print("Sálario: R$")
        val salario = entrada.nextInt()
        entrada.nextLine()
        print("Sexo 'f' ou 'm': ")
        val sexo = entrada.nextLine()
        print("Estado Civel: 's','c','v','d': ")
        val estadoCivil = entrada.nextLine()

        if(nome.length < 3){
            println("Numero de caracteres em NOME, insuficiente: ")
        } else if(idade < 0 || idade > 150){
            println("Idade invalida")
        } else if(salario <= 0){
            println("Salario invalido")
        } else if(sexo[0] != 'f' && sexo[0] != 'm'){
            println("Sexo invalido")
        } else if(estadoCivil[0] != 's' && estadoCivil[0] != 'c' && estadoCivil[0] != 'v' && estadoCivil[0] != 'd'){
            println("Estado Civil invalido")
        } else {
            indice++
        }
    }
}