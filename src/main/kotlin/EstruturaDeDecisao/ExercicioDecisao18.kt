package EstruturaDeDecisao

import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)
    println("Digite a data atual no formato dd/mm/aaaa")
    print("Dia: ")
    val dia = entrada.nextInt()
    print("Mês: ")
    val mes = entrada.nextInt()
    print("Ano: ")
    val ano = entrada.nextInt()

    var mesCorreto = 0;
    val opcao = when (mes) {
    1, 3, 5, 7, 8, 10, 12 -> mesCorreto = 31
        4, 6, 9, 11 -> mesCorreto = 30;
          2 -> mesCorreto = 28
        else -> println("Data invalida")
    }

    if(ano % 4 == 0 && ano % 100 != 0){
        mesCorreto = 29
    } else if(ano % 400 == 0 && ano  % 100 != 0){
        mesCorreto = 29
    } else {
    }

    if(dia > mesCorreto){
        println("Data invalida")
    } else {
        println("$dia/$mes/$ano")
    }


}