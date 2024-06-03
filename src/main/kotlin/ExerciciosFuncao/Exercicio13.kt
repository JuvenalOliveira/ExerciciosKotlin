package org.example.ExerciciosFuncao
import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)
    var indice = 0;
    var linha = 0;
    var coluna = 0;

    while (indice != 1) {
        println("Insira um nomero de linha(s)")
        linha = entrada.nextInt()
        println("Insira o numero de coluna(s)")
        coluna = entrada.nextInt()
        if(linha < 1 || linha > 20){
            println("Tamanho da linha invalido")
            println("Insira um valor de 1 a 20")
            indice = -1
        }else if(coluna < 1 || coluna > 20){
            println("Tamanho da coluna invalido")
            println("Insirra um valor de 1 a 20")
            indice = -1
        }
        indice++
    }

    Retangulo(linha,coluna)
}

fun Retangulo(x: Int, y: Int) {
    for (i in 0..x) {
        print("-")
    }
    println()
    for (i in 0..y) {
        print("|")
        for(i in 0..x-2){
            print("+")
        }
        print("|")
        println()
    }
    for (i in 0..x) {
        print("-")
    }
}