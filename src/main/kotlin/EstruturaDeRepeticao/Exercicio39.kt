package EstruturaDeRepeticao

import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)
    var indice = 1;
    var x = 0.0;
    var maior = -1000.0;
    var menor = 1000.0;
    var num = 0;
    var numMaior = 0;
    var numMenor = 0;

    while(indice < 11){
        println("Qual o numero do aluno? ")
        num = entrada.nextInt();

        print("Aluno($indice) - Altura: ")

        x = entrada.nextDouble();

        if(maior < x){
            maior = x;
            numMaior =  num
        } else if(menor > x){
            menor = x;
            numMenor = num
        }
        indice++
    }
    println("O aluno Numero-($numMaior) é o maior, com a altura de: $maior cm")
    println("O aluno Numero-($numMenor) é o menor, com a altura de: $menor cm")

}