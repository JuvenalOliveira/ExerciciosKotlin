package EstruturaDeRepeticao

import java.util.Scanner

fun main() {
    val entrada = Scanner(System.`in`)
    println("Insira um valor: ")
    val x = entrada.nextInt()

    if (x != null && x > 1) {
        var conta = 0

        println("Números primos entre 1 e $x:")
        for (i in 2..x) {
            var primo = true
            for (j in 2 until i) {
                if (i % j == 0) {
                    primo = false
                    break
                }
            }
            if (primo){
                println(i)
                conta++
            }
        }
        println("Numero primos: $conta")
    }
}
