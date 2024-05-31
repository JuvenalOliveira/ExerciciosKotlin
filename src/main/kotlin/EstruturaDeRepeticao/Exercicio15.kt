package EstruturaDeRepeticao

import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)
    println("Insira um valor")
    var x = entrada.nextInt()
    var indice = 0;
    var y = 1;
    var z = 1;

    while(indice < x){
        print("$y,")
        val j = z
        z = y;
        y += j;
        indice++
    }
}