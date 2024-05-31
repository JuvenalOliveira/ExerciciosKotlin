package EstruturaDeRepeticao

import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)

    println("Insira a quantidade total de turmas")
    var x = entrada.nextInt()
    println("Insira a quantidade de alunos nas $x turmas")
    var indice = 1;
    var y = 0;
    var soma = 0;
    var divisao = 0;

    while(indice < x + 1){
        println("Turma $indice possui quantos alunos?")
        y = entrada.nextInt()
        if(y > 40){
            println("O numero maximo de alunos por turma é de 40, insira outra turma!")
            indice--
        }
        soma += y
        indice++
    }
    divisao = soma / x

    println("A média de alunos por turma é de: $divisao")
}