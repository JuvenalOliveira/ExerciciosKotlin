package EstruturaDeDecisao

import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)
    println("Insira as 3 notas do aluno(a)")
    print("(1): ")
    var x = entrada.nextDouble()
    print("(2): ")
    var y  = entrada.nextDouble()
    print("(3): ")
    var z = entrada.nextDouble()

    var media = (x + y + z) / 3

    if(media == 10.0){
        println("Parabens média maxima alcançada, você foi aprovado!")
    } else if(media >= 7.0){
        println("Aprovado")
    } else{
        println("Reprovado")
    }
}