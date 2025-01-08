fun main(args: Array<String>){
    codidoFuncional()
}

fun codidoFuncional(){
    do {
        println("continua ou p?")
        val o = readln();
    }while (o.lowercase() != "p")
}

fun codigoDesfuncional(){
    println("continua ou p?")
    var o = readln();
    while (o.lowercase() != "p"){
        println("continua ou p?")
        o = readln();
    }
}