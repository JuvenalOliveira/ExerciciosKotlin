package org.example
import java.util.Scanner

  fun main() {
        val entrada = Scanner(System.`in`)

        println("Insira o tamanho em Metros quadrados da área a ser pintada: ")
        val area = entrada.nextDouble();
        val lata = 18;
        val precoLata = 80;
        val galao = 3.6;
        val precoGalao = 25;


        val litrosNecessarios = area / 6;

      val tintaLata = Math.ceil((litrosNecessarios * 1.1) / lata).toInt()
        val valorLata = tintaLata * precoLata;

      val tintaGalao = Math.ceil((litrosNecessarios * 1.1) / galao).toInt()
        val valorGalao = tintaGalao * precoGalao;

      val litrosRestantesLata = Math.ceil((tintaLata * lata - litrosNecessarios * 1.1) / lata).toInt();
      val tintaGalaoNaMistura = Math.ceil(litrosRestantesLata * 10 / galao).toInt()
      val valorMistura = litrosRestantesLata * precoLata + tintaGalaoNaMistura * precoGalao

        println("A quantidade de litros de tinta que será gasta é de: $litrosNecessarios")
        println("");
        println("Comprar apenas latas");
        println("  A quantidade de lata de tinta que será necessario é de: $tintaLata");
        println("  O valor total a ser é de $valorLata");
        println("");
        println("Comprar apenas galões");
        println("  A quantidade de galões de tinta que será necessario é de: $tintaGalao\"");
        println("  O valor total a ser pago é de $valorGalao");
        println("");
        println("Misturar latas e galões:")
        println("  Quantidade de latas necessárias: $litrosRestantesLata")
        println("  Quantidade de galões necessários na mistura: $tintaGalaoNaMistura")
        println("  Preço total a ser pago pela mistura: R$$valorMistura")

}
