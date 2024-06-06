package EstruturaDeRepeticao

import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)
    var indice = 1;
    var x = 0;
    var numV = 0;
    var numA = 0;
    var soma = 0;
    var media = 0;
    var mediaAcidente = 0;
    var totalDoisMil = 0;
    var maior = -1000;
    var menor = 1000;
    var codigoMaior = 0;
    var codigoMenor = 0;
    var contador = 0;

    while(indice < 6){
        println("Cidade - ($indice)")

        print("Código da cidade - ")
        x = entrada.nextInt();
        print("Numero de veiculos de passeio - ")
        numV = entrada.nextInt();
        print("Numero de acidentes com vitimas - ")
        numA =  entrada.nextInt()

        if(maior < numA){
            maior = numA;
            codigoMaior = x;
        } else if(menor > numA){
            menor = numA;
            codigoMenor = x;
        }


        if(numV < 2000){
            contador++
            totalDoisMil += numA
        }
        soma += numV
        indice++
    }
    media = numV / 5
    mediaAcidente = totalDoisMil / contador


    println("O maior indice de Acidente é da cidade $codigoMaior com $maior acidentes")
    println("O menor indice de Acidente é da cidade $codigoMenor com $menor acidentes")
    println("Média de veiculos das 5 cidades: $media")
    println("Media de acidentes de transito com cidades com menos de 2000 veiculos de passeio: $mediaAcidente")
}