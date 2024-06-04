package EstruturaDeRepeticao

fun main(){
    var x = 1;
    for(i in 1 until 51){
        if(x % 2 == 0){
            x += 1
        } else{
            println(x)
            x += 1
        }
    }
}

