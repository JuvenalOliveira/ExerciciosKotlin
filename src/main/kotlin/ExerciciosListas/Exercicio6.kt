package ExerciciosListas

import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)
    val alunos = 4;
    val notas = 4;
    val lista =  arrayListOf<Int>()
    var indice = 1;
    var contador = 1;
    var x = 0;

while (indice < alunos + 1){
    println("Insira as notas do aluno $indice")
    println("Aluno ($indice)")
    var soma = 0;
    while(contador <  notas + 1){
        print("Nota-[$contador]: ")
        x = entrada.nextInt()
        soma += x;
        contador++
    }
    var media = soma / notas
    lista.add(media)
    indice++
    contador = 1;
}
    lista.forEach(){elemento->
        if(elemento >= 7) {
            println(elemento)
        }
    }
}