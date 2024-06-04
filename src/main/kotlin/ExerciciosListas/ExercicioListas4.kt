package ExerciciosListas

fun main(){
    val lista = arrayOf(
    "A","B","C","D","E","F","G","H","I","J"
    )
    var contador = 0;
    var num = 0;

    lista.forEach {elemento->
        if(elemento == "A" || elemento ==  "E" || elemento == "I"  || elemento == "O"  || elemento == "U"){
            contador++
        }
        num  = lista.size - contador
    }
    println(num)
}