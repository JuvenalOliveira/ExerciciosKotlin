package EstruturaDeRepeticao

import java.util.Scanner

fun main() {
    val entrada = Scanner(System.`in`)
    var menu = 0;
    var indice = 0;
    var total = 0.0;
    var preco = 0.0;
    var valor = 0.0;

    while (indice != 1) {
        println("Insira o código do produto que deseja: ")
        println("código (100) Cachorro Quente R$1,20")
        println("código (101) Bauru Simples R$ 1,30")
        println("código (102) Bauru com Ovo R$ 1,50")
        println("código (103) Hambúrguer R$ 1,20")
        println("código (104) Cheeseburguer R$ 1,30")
        println("código (105) Refrigerante R$ 1,00")

        println("Insira o codigo do produto que voce deseja comprar")
        menu = entrada.nextInt()

        when (menu) {
            100 -> preco = 1.20
            101 -> preco = 1.30
            102 -> preco = 1.50
            103 -> preco = 1.20
            104 -> preco = 1.30
            105 -> preco = 1.0
            else -> println("Opção invalida")
        }
        println("Quantas unidades voce vai querer?")
        var quantidade = entrada.nextInt()
        total = quantidade * preco

        valor += total;
        preco = 0.0;
        quantidade = 0;

        println("Deseja finalizar a compra?")
        println("(0) SIM (1) NÃO")
        indice = entrada.nextInt()
        if(indice == 0){
            println("O valor total é: $valor")
            return;
        }
    }
}