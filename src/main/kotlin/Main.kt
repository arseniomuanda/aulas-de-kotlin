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
    var o = "";
    while (o.lowercase() != "p"){
        println("continua ou p?")
        o = readln();
    }
}
