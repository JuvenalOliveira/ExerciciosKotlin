package EstruturaDeRepeticao

import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)
    println("Insira um valor de 500 para cima!")
    var x = entrada.nextInt()
    var indice = 0;
    var contador = 0;
    var y = 1;
    var z = 1;

    while(contador != 1){
        if(x < 499){
            println("Valor invalido, insira um valor ideal")
            x = entrada.nextInt()
        }else{
            contador == 1;
        }
        while(contador != 1)
        while(indice < x){
            print("$y,")
            val j = z
            z = y;
            y += j;
            indice++
        }
}
    }