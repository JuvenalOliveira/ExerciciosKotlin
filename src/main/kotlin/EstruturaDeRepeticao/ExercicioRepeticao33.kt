package EstruturaDeRepeticao

import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)
    println("Quantos dados de temperatura você deseja informar? ")
    val num = entrada.nextInt();
    var indice = 1;
    var x = 0.0;
    var soma = 0.0;
    var media = 0.0;
    var maior = -1000.0;
    var menor = 1000.0;

    println("Insire a(s) temperatura(s)")
    while(indice < num + 1){
        print("[$indice] - ")
        x = entrada.nextDouble();
        if(maior < x){
            maior = x;
        } else if(menor > x){
            menor = x;
        }
        soma += x
        indice++
    }
    media = maior / num

    println("A maior temperatura Registrada foi: $maior")
    println("A menor temperatura Registrada foi: $menor")
    println("A média das temperatudas é de: $media")
}