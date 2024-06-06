package EstruturaDeRepeticao

import java.util.Scanner

fun main(){
    val entrada = Scanner(System.`in`)

    var codigo = 1.0
    var codigoMaior = 0.0
    var codigoMenor = 0.0
    var codigoGordo = 0.0
    var codigoMagro = 0.0


    var peso = 0.0
    var altura = 0.0
    var somaAltura = 0.0
    var mediaAltura = 0.0
    var somaPeso = 0.0
    var mediaPeso = 0.0
    var maior = -1000.0
    var magro = 1000.0
    var gordo = -1000.0
    var menor = 1000.0
    var indice = 0.0
    var x = 0.0
    var contador = 0.0

    do{
    println("Insira seu código")
        print("Código: ")
        codigo = entrada.nextDouble()

        if(codigo == 0.0){
            indice++
            break;
        }

        print("Peso: Kg-")
        peso = entrada.nextDouble()
        entrada.nextLine()
        print("Altura: Mc-")
        altura =  entrada.nextDouble()

        if(gordo < peso){
            gordo = peso
            codigoGordo = codigo
        }
        if(magro > peso){
            magro = peso
            codigoMagro = codigo
        }
        if(maior < altura){
            maior = altura
            codigoMaior = codigo
        }
        if(menor > altura){
            menor = altura
            codigoMenor = codigo

            somaAltura += altura
            somaPeso += peso

            contador++
        }
    }while(indice != 1.0)

    mediaPeso = somaPeso / contador
    mediaAltura = somaAltura / contador

    println("Mais Alto: ")
    print("Código: [$codigoMaior]-Altura: $maior")
    println()

    println("Mais Baixo: ")
    print(("Código: [$codigoMenor]-Altura: $menor"))
    println()

    println("Mais Pesado: ")
    print(("Código: [$codigoGordo]-Peso: $gordo"))
    println()

    println("Mais Leve: ")
    print(("Código: [$codigoMagro]-Peso: $magro"))
    println()

    println("Média das alturas: ")
    print("$mediaAltura")
    println()

    println("Média dos pesos: ")
    print("$mediaPeso")
    println()
}