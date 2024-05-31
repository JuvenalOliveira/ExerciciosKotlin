package EstruturaDeRepeticao

import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)
    var y = 0;
    println("Insira 5 valores")
    for(i in 1 until 6){
        print("[$i]- ")
        val x = entrada.nextInt()
            y += x;
        if(i == 5){
            println("O valor da soma total é: $y")
            y = y / i
        }
        }
    println("A média é: $y")
    }

