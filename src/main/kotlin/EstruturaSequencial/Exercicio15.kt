package org.example
import java.util.Scanner;

fun main(){
    val entrada = Scanner(System.`in`);

    println("Quantos voce ganha por hora trabalhada? ")
    val x = entrada.nextDouble();
    println("Quantas horas você trabalha por mês? ")
    val y = entrada.nextInt();

    val salarioBruto = x * y;
    val imposto = salarioBruto * 0.11;
    val inss = salarioBruto * 0.08;
    val sindicato = salarioBruto * 0.05;
    val descontos = imposto + inss + sindicato;
    val salarioLiquido = salarioBruto - descontos;

    println("O salario bruto é: $salarioBruto")
    println("O valor pago ao INSS é: $inss")
    println("O valor pago ao sindicato é: $sindicato")
    println("O total de descontos do salario é: $descontos")
    println("O salario liquidos é de: $salarioLiquido")

}

