package EstruturaDeDecisao

import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)

    println("Qual ano deseja inserir? ")
    val x = entrada.nextInt();

    if(x % 4 == 0 && x % 100 != 0){
        println("O ano é bissexto")
    } else if(x % 400 == 0 && x  % 100 != 0){
        println("o ano é bissexto")
    } else {
        println("O ano não é bissexto")
    }
}