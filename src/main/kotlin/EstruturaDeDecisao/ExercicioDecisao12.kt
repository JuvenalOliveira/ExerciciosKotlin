package org.example
import java.util.Scanner;

fun main(){
    val entrada = Scanner(System.`in`);

    println("Quantos voce ganha por hora trabalhada? ")
    val x = entrada.nextDouble();
    println("Quantas horas você trabalha por mês? ")
    val y = entrada.nextInt();

    val salarioBruto = x * y;
    var ir = 0.0
    var mostrarIR = 0.0

    if(salarioBruto <= 900){
        ir = 0.0
        mostrarIR = 0.0
    } else if(salarioBruto > 900 && salarioBruto <= 1500){
        ir = salarioBruto *0.05
        mostrarIR = 0.5
    } else if(salarioBruto > 1500 && salarioBruto <= 2500){
        ir = salarioBruto *0.10
        mostrarIR = 0.10
    } else{
        ir = salarioBruto *0.20
        mostrarIR = 0.20
    }
    val inss = salarioBruto * 0.10;
    val fgts = salarioBruto * 0.11;
    val descontos = ir + inss;
    val salarioLiquido = salarioBruto - descontos;

    println("O salario bruto é: $salarioBruto")
    println("(-) IR (%$mostrarIR) : R$ $ir")
    println("(-) INSS (%10%) : R$ $inss")
    println("FGTS (%11) : R$ $fgts")
    println("O total de descontos do salario é: $descontos")
    println("O salario liquidos é de: $salarioLiquido")

}

