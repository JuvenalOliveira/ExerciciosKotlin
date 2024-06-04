package org.example.ExerciciosFuncao

fun main(){
    val x = -1
    val retorno = checar(x)
    println(retorno)
}
fun checar(x: Int):Char{
    var retorno = 'o'
    if (x < 0) {
        retorno = 'N'
    } else {
        retorno = 'P'
    }
    return retorno
}