package EstruturaDeDecisao

import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)
    println("Insira o valor que seja sacar: ")
    val x = entrada.nextInt()

    var cem = 100;
    var cinquenta = 50;
    var dez = 10;
    var cinco = 5;
    var um = 1;

    if(x < 10 || x > 600){
        println("Valor inserido indispoveil!")
        return;
    } else {
        val notaCem = x / cem;
        val restoCem = x %  cem;
        val notaCinquenta = restoCem / cinquenta
        val restoCinquenta = restoCem % cinquenta
        val notaDez = restoCinquenta / dez
        val restoDez = restoCinquenta % dez
        val notaCinco = restoDez / cinco
        val notaUm = restoDez % cinco

        println("Quantidade a ser sacada $x")
        println("[$notaCem] nota(s) de 100")
        println("[$notaCinquenta] nota(s) de 50")
        println("[$notaDez] nota(s) de 10")
        println("[$notaCinco] nota(s) de 5")
        println("[$notaUm] nota(s) de 1")


    }
}