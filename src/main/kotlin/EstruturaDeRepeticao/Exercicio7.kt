package EstruturaDeRepeticao

import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)
    var y = 0;
    println("Insira 5 valores")
    for(i in 1 until 6){
        print("[$i]- ")
        val x = entrada.nextInt()
        if(x > y){
            y = x;
        }
    }
    println("O maior valor é $y")
}

