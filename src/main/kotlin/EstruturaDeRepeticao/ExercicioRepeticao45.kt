package EstruturaDeRepeticao

import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)

    var indice = 1;
    var resposta = "";
    var acerto = 0;
    var maior = 0;
    var soma = 0;
    var media = 0;
    var menor = 10;
    var menu = 0;


    while(indice != 0){
    print("($indice)- ")
        resposta = entrada.nextLine()
        if(indice == 1 && resposta == "A" ){
        acerto++
        } else if(indice == 2 && resposta == "B"){
            acerto++
        } else if(indice == 3 && resposta == "C"){
            acerto++
        } else if(indice == 4 && resposta == "D"){
            acerto++
        } else if(indice == 5 && resposta == "E"){
            acerto++
        } else if(indice == 6 && resposta == "E"){
            acerto++
        } else if(indice == 7 && resposta == "D"){
            acerto++
        } else if(indice == 8 && resposta == "C"){
            acerto++
        } else if(indice == 9 && resposta == "B"){
            acerto++
        } else if(indice == 10 && resposta == "A"){
            acerto++
        }

        if(acerto > maior){
            maior = acerto
        }else if(menor > acerto){
            menor = acerto
        }
        soma += acerto

        if(indice == 10){
            println("Deseja continuar com o programa?")
            println("(1) Sim")
            println("(2) Não")
            menu = entrada.nextInt()
            entrada.nextLine()
            if(menu == 2){
                break;
            }else{
                indice = 0
            }
        }
        indice++
    }
    media = soma / (indice / 10)

    println("A maior nota é $maior")
    println("A menor nota é $menor")
    println("A media das notas é $media")
}