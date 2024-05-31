package EstruturaDeDecisao

import java.util.Scanner

fun main() {
    val entrada = Scanner(System.`in`)
    do {
        var menu = 0;
        println("Insira dois valores: ")
        print("[1]: ")
        var x = entrada.nextDouble()
        print("[2]: ")
        var y = entrada.nextDouble()

        var total = 0.0;

        println("Qual operação deseja realizar?")
        println("(1) Soma")
        println("(2) Subtração")
        println("(3) Divisão")
        println("(4) Multiplicação")
        println("(0) Encerrar o programa")

        menu = entrada.nextInt()

        val opcao = when(menu){
            0 -> menu = 1;
            1 -> total = x + y;
            2 -> total = x - y;
            3 -> total = x / y;
            4 -> total = x * y;
            else -> "Opção invalida";
        }

       println("O resultado da conta é: $total")

        if(total % 2 == 0.0){
            println("[$total] é um numero par")
        } else {
            println("[$total] é um numero impar")
        }

        if(total >= 0){
            println("[$total] é um numero positivo")
        } else {
            println("[$total] é um numero negativo")
        }

        if(total % 1 == 0.0){
            println("[$total] é um numero inteiro")
        } else {
            println("[$total] é um numero decimal")
        }

    }while(menu == 1)

}