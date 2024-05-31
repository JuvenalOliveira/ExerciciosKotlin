package EstruturaDeRepeticao

import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)
    var indice = 1;
    var x = 0.0;
    var total = 0.0;
    var dinheiro = 0.0;
    var troco = 0.0;

    do{
        println("Lojas Tabajara")
        while(indice != 0){
        print("Produto $indice: R$ ")
            x =  entrada.nextDouble()
            total += x;
            indice++
                if(x == 0.0){
                    break;
                }
        }
        println("Total: R$ $total")
        println("Valor do pagamento: ")
        dinheiro = entrada.nextDouble()

        troco = dinheiro - total;

        println("Dinheiro: R$ $dinheiro")
        println("Troco: R$ $troco")
        println()
    }while(indice != 0);
}