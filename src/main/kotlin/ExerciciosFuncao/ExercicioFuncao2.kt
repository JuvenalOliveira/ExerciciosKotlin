package org.example.ExerciciosFuncao

fun main(){
    incrementarLista()
}
fun incrementarLista(){
    val lista = arrayListOf<Int>()
    var n = 1;
    for(i in 0..9) {
        lista.add(n)
        mostrarLista(lista)
        println()
        n++
    }
}
fun mostrarLista(lista: ArrayList<Int>){
    lista.forEach{i->
        print("$i  ")
    }
}