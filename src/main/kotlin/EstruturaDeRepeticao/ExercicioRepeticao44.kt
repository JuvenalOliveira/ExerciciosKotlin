package EstruturaDeRepeticao

import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)
    var indice = 1;
    var x = 0;
    var x1 = 0;
    var x2 = 0;
    var x3 = 0;
    var x4 = 0;
    var nulo = 0;
    var branco = 0;
    var total = 0;
    var mediaBranco = 0;
    var mediaNulo = 0;

    println("Insira o valor conforme sua escolha de voto: ")
    println("(1)- Nicolas")
    println("(2)- Ryan")
    println("(3)- Salles")
    println("(4)- Bruno")
    println("(5)- Voto Nulo")
    println("(6)- Voto em Branco")
    println("(0)- Encerrar votação")
    while(indice != 0){
    print("Voto [$indice]-")
        x = entrada.nextInt()
        if(x == 0){
            println("Votação encerrada!")
            indice = 0;
        }
        if(x == 1){
            x1++
        }else if(x == 2){
            x2++
        }else if(x == 3){
            x3++
        }else if(x == 4){
            x4++
        }else if(x == 5){
            nulo++
        }else if(x == 6){
            branco++
        }else{
            println("Valor inserido invalido!")
            indice--
        }
        indice++
    }
    total = x1 + x2 + x3 + x4 + nulo + branco
    mediaBranco = total * branco/100
    mediaNulo = total * nulo/100

    println("Total de votos: ")
    println("(1)- Nicolas- $x1")
    println("(2)- Ryan- $x2")
    println("(3)- Salles- $x3")
    println("(4)- Bruno- $x4")
    println("(5)- Voto Nulo- $nulo")
    println("(6)- Voto em Branco- $branco")
    println("(0)- A percentagem de votos nulos sobre o total de votos - $mediaNulo %")
    println("(0)- A percentagem de votos em branco sobre o total de votos - $mediaBranco %")
}