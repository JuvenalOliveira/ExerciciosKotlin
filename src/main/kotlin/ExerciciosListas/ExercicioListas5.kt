package ExerciciosListas

fun main(){
    val lista = arrayOf(
        1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20
    )
    val impar = arrayListOf<Int>()
    val par = arrayListOf<Int>()

    lista.forEach {elemento ->
      if(elemento % 2 == 0){
          par.add(elemento)
      }else{
          impar.add(elemento)
      }

    }
    println("\nImprimindo todos os valores da lista")
    lista.forEach { elemento ->
        println(elemento
        )
    }
    println("\nImprimindo todos os Impares da lista")
    impar.forEach { elemento ->
        println(elemento)
    }
    println("\nImprimindo todos os Pares da lista")
    par.forEach { elemento ->
        println(elemento)
    }
}