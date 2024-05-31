package EstruturaDeRepeticao

import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)
    println("Insira dois valores: ")
    print("[1]-")
    val x = entrada.nextInt()
    print("[2]-")
    val y = entrada.nextInt()

    var x1 = x;

    var indice = 0

    println(x)

    while(indice != 1){
    if(x1 < y){
        x1 += 1;
        println(x1)
    } else {
        indice++
    }
    }
}