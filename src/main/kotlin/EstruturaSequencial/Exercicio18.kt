package org.example
import java.util.Scanner
fun main(){
    val entrada = Scanner(System.`in`)

    println("Qual o tamanho do arquivo? (MB): ")
    val arquivoMB = entrada.nextDouble()

    println("Insira a velocidade da sua internet (Mbps): ")
    val velocidade = entrada.nextDouble()

    val velocidadeMB = velocidade / 8;

    val tempoSegundos = arquivoMB / velocidadeMB;

    val tempoMinuto = tempoSegundos / 60;

    println("O tempo de dowload do arquivo é de $tempoMinuto Minutos")
}