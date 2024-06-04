package org.example.ExerciciosComString

fun main(){
    val palavra = "Meu nome é Jotaro Joestar"
    val x = palavra.toList()
    var contador = 0;
    var indice = 0;
    for(i in 0..x.size-1){
        if(x[i] == ' '){
            contador++
        }
        if(x[i] == 'a' || x[i] == 'A' || x[i] == 'e' || x[i] == 'E' || x[i] == 'i' || x[i] == 'I' || x[i] == 'o' || x[i] == 'O' || x[i] == 'u' || x[i] == 'U'){
            indice++
        }
    }
    println("A String possui $contador Espaços")
    println("A String possui $indice Vogais")
    }
