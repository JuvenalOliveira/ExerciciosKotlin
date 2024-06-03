package org.example
import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)
    println("Informe o salario para ajuste: ")
    val salario = entrada.nextDouble()
    var aumento = 0.0;
    var novoSalario = 0.0;

    if(salario <= 280){
    aumento = salario * 0.20
        novoSalario = salario + aumento;
        println("O salario atual é de: $salario")
        println("O percentual de aumento é de 20%")
        println("O valor do aumento é de: $aumento")
        println("O novo valor é de: $novoSalario")
    } else if(salario > 280 && salario < 700){
        aumento = salario * 0.15
        novoSalario = salario + aumento;
        println("O salario atual é de: $salario")
        println("O percentual de aumento é de 15%")
        println("O valor do aumento é de: $aumento")
        println("O novo valor é de: $novoSalario")
    } else if(salario >= 700 && salario < 1500){
        aumento = salario * 0.10
        novoSalario = salario + aumento;
        println("O salario atual é de: $salario")
        println("O percentual de aumento é de 10%")
        println("O valor do aumento é de: $aumento")
        println("O novo valor é de: $novoSalario")
    } else{
        aumento = salario * 0.05
        novoSalario = salario + aumento;
        println("O salario atual é de: $salario")
        println("O percentual de aumento é de 5%")
        println("O valor do aumento é de: $aumento")
        println("O novo valor é de: $novoSalario")
    }
}