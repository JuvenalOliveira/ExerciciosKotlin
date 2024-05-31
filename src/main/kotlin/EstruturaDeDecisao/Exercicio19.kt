package EstruturaDeDecisao

import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)
    println("Insira um numero")
    var x = entrada.nextInt()
    var centena = 100;
    var dezena = 10;
    var unidade = 1;

    if(x < 1000){
     var xCentena =  x / centena;
        var restoCentena = x % centena
            var xDezena  = restoCentena / dezena
                var xUnidade = restoCentena  % dezena
        println("[$x]")
        println("Centena = $xCentena")
        println("Dezena = $xDezena")
        println("Unidade = $xUnidade")
    }

}