package EstruturaDeRepeticao

import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)

    println("Tem quantos pessoas na sala? ")
    var x = entrada.nextInt()

    println("Insira a idade dos $x alunos")
    var indice = 1;
    var y = 0;
    var soma = 0;
    var divisao = 0;

    while(indice < x + 1){
        print("($indice)- ")
        y = entrada.nextInt()
        soma += y
        indice++
    }
    divisao = soma / x
    if(divisao <= 25){
        println("A turma é jovem")
    } else if(divisao > 25  && divisao <= 60){
        println("A turma é adulta")
    } else {
        println("A turma é idosa")
    }
}