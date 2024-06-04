package org.example.ExerciciosFuncao

fun main() {
    IncrementarLista()
}

fun IncrementarLista() {
    var lista = arrayListOf<Int>()
    for (i in 1..10) {
        lista = Igual(i)
        MostrarLista(lista)
        println()
    }
}

fun MostrarLista(lista: ArrayList<Int>) {
    lista.forEach { i ->
        print("$i  ")
    }
}

fun Igual(n: Int): ArrayList<Int> {
    val novaLista = ArrayList<Int>()
    for(i in 1..n){
        novaLista.add(n)
    }
    return novaLista
}
