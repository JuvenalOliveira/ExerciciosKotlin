package ExerciciosListas

fun main(){
    val lista = arrayOf(
        10, 10 , 10 , 10
    )

    var soma = 0;

    lista.forEach{ elemento->
        soma += elemento
    }
    var media = soma / lista.size
    println(media)
}