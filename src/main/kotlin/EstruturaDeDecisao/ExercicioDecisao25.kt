package EstruturaDeDecisao

import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)

    var contador = 0;

    println("\nTelefonou para a vítima?")
    val respostaA =  entrada.nextLine()
    if(respostaA == "sim" || respostaA == "s") {
        contador++;
    }
    println("Esteve no local do crime?")
    val respostaB =  entrada.nextLine()
    if(respostaB == "sim" || respostaB == "s") {
        contador++;
    }
    println("Mora perto da vítima?")
    val respostaC =  entrada.nextLine()
    if(respostaC == "sim" || respostaC == "s") {
        contador++;
    }
    println("Devia para a vítima?")
    val respostaD =  entrada.nextLine()
    if(respostaD == "sim" || respostaD == "s") {
        contador++;
    }
    println("Já trabalhou com a vítima?")
    val respostaE =  entrada.nextLine()
    if(respostaE == "sim" || respostaE == "s") {
        contador++;
    }

    if(contador == 5){
        println("Assasino")
    } else if(contador == 3 || contador == 4){
        println("Cumplice")
    } else if(contador == 2){
        println("Suspeita")
    } else {
        println("Inocente")
    }


}