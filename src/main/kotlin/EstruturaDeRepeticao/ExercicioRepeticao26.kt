package EstruturaDeRepeticao

import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)

    println("Insira a quantidade de eleitores")
    var x = entrada.nextInt()
    println("Os $x Eleitores devem votar")

    println("(1)-Para votar no candidato A")
    println("(2)-Para votar no candidato B")
    println("(3)-Para votar no candidato C")

    var indice = 1;
    var y = 0;
    var soma = 0;
    var divisao = 0;
    var a = 0
    var b = 0
    var c = 0


    while(indice < x + 1){
        print("Eleitor [$indice]: Voto- ")
        y = entrada.nextInt()
        if(y > 3){
            println("Voto invalido, Vote novamente com um candidato valido: ")
            indice--
        }else if(y == 1){
            a++
        }else if(y == 2){
            b++
        }else if(y == 3){
            c++
        }
            indice++
    }
    println("Votos")
    println("Candidato A - $a Votos")
    println("Candidato B - $b Votos")
    println("Candidato C - $c Votos")


}