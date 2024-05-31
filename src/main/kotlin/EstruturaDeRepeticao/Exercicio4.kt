package EstruturaDeRepeticao

fun main(){
    var A = 80000.0;
    var B = 200000.0;
    var crescimentoA = 0.0;
    var crescimentoB = 0.0;
    var ano = 0;

    while(A <= B){
        crescimentoA = A * 0.03;
        crescimentoB = B * 0.015;
        A = A + crescimentoA
        B = B + crescimentoB
        ano++
        println("Ano - $ano")
    }
}