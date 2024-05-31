package EstruturaDeRepeticao

import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)
    var indice = 1;
    var y1 = 0;
    var y2 = 0;
    var y3 = 0;
    var y4 = 0;

    println("Insira os valores")
    while(indice > 0) {
        print("[$indice] - ")
        var x = entrada.nextInt()

        if (x <= 0) {
            indice = -5
        } else if (x < 26) {
            y1++
        } else if (x >= 26 && x <= 50) {
            y2++
        } else if (x >= 51 && x <= 75) {
            y3++
        } else if (x >= 76 && x <= 100){
            y4++
    }
        indice++
    }
    println("Entre 0-25 possui $y1")
    println("Entre 26-50 possui $y2")
    println("Entre 51-75 possui $y3")
    println("Entre 76-100 possui $y4")
}