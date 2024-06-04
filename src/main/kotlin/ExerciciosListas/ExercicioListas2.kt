package ExerciciosListas

fun main(){
    val lista = arrayOf(
        1,2,3,4,5,66,7,8,9,10
    )
    lista.reversed().forEach{elemento ->
        println(elemento)
    }
    println()
    for(i in lista.size -1 downTo 0){
    println(lista[i])
    }

}