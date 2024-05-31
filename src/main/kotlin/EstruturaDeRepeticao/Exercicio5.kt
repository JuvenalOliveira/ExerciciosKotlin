package EstruturaDeRepeticao

import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)
    println("Informe a população da cidade A")
    var A = entrada.nextDouble()
    println("Informe a população da cidade B")
    var B = entrada.nextDouble()
    println("Informe a % de crescimento da cidade A")
    var crescimentoA = entrada.nextDouble() / 100
    println("Informe a % de crescimento da cidade B")
    var crescimentoB = entrada.nextDouble() / 100
    var ano = 0;


    while(A <= B){
        var Asoma = A * crescimentoA;
        var Bsoma = B * crescimentoB;
        A = A + Asoma
        B = B + Bsoma
        ano++
        println("Ano - $ano")
    }
}