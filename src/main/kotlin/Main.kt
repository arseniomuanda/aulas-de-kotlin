//fun main() {
//    println("Hello World!") // aqui pulamos para a proxima linha
//    print("Arsenio") // aqui nao pulamos para a proxima linha
//    println()
//    //Val é usado para read-only
//    //Var é usado para variaveis mutaveis//

//    val name = "Arsenio Muanda"
//    var outherName = "sem nome"//

//    println(name)
//    println(outherName)
//    outherName = "Paulo"
//    println(outherName)//

//    //String Template
//    println("Meu nome é Arsénio e eu tenho ${2025 - 1996} aos de idade")//

//    //exc1()
//    //exc2()
//    //exc3()//

//    pratice2()
//    pratice3()
//}//

//fun exc1() {
//    val a: Int = 1000
//    val b: String = "log message"
//    val c: Double = 3.14
//    val d: Long = 100_000_000_000_000 + 1
//    val e: Boolean = false
//    val f: Char = '\n'//

//    println(d)
//}//

//fun exc2() {
//    //lista nao mutavel
//    val alunos: List<String> = listOf<String>("Arsenio", "Teresa", "Girão")
//    println(alunos)
//    //Lista mutavel
//    var alunos2: MutableList<String> = mutableListOf<String>("Arseni", "Maura")
//    println("O numero de elementos de alunos2 é de ${alunos2.size}")
//    println(alunos2)
//
//    val shapes = mutableListOf("arsenio")
//    shapes.add("Muanda")
//
//    alunos2.add("Paula")
//    println("Agora, o numero de elementos de alunos2 é de ${alunos2.size}")
//    println(alunos2)
//}
//
///**
// * Agora vamos falar sobre os conjuntos
// */
//fun exc3() {
//    val fruits = setOf("Banana, Manga, Banana")
//    println(fruits)
//
//    val fruits2 = mutableSetOf("Laranja")
//    addFruit(fruits2);
//    println(fruits2)
//}
//
//fun addFruit(fruitList: MutableSet<String>) {
//    var option: Int;
//    do {
//        print("Digita o nome da nova fruta: ")
//        fruitList.add(readln())
//        printFruit(fruitList)
//        print("Se deseja continuar prima 1: ")
//        option = readln().toInt()
//    } while (option == 1)
//}
//
//fun printFruit(list: Set<String>) {
//    println("$list com ${list.count()}")
//}
//
///**
// * Handling with maps
// */
//fun exc4() {
//    var list: MutableMap<String, Any>
//}
//
//fun pratice1() {
//    val greenNumbers = listOf(1, 4, 23)
//    val redNumbers = listOf(17, 2)
//    val total = greenNumbers.count() + redNumbers.count()
//// Write your code here
//    println("We have ${greenNumbers.count()} green numbers and ${redNumbers.count()} red numbers e no total são $total numbers")
//}
//
//fun pratice2() {
//    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
//    val requested = "smtp"
//    // val isSupported = requested in SUPPORTED
//    val isSupported = requested.uppercase() in SUPPORTED
//    println("Support for $requested: $isSupported")
//}
//
///**
// * Exercise 3
// * Define a map that relates integer numbers from 1 to 3 to their corresponding spelling. Use this map to spell the given number.
// */
//fun pratice3() {
//    val number2word = mapOf(1 to "one", 2 to "two", 3 to "three")
//    val n = 2
//    println("$n is spelt as '${number2word[n]}'")
//}

///Conditional expressions

//fun main() {
//    print("Digita a entrada: ")
//    val entrada: String = readln()
//    //app(entrada)
//    //print(app2(entrada))
//    app3(entrada)
//}
//
//fun app(entrada: String) {
//    when (entrada) {
//        "arsenio" -> print("Arsenio")
//        "" -> print("Nada")
//        else -> print("Victória")
//    }
//}
//
//fun app2(entrada: String): String {
//    return when {
//        entrada.lowercase() == "teresa" -> "Irmã"
//        entrada.lowercase() == "ed" -> "Irmão"
//        entrada.lowercase() == "victoria" -> "Namorada"
//        else -> "Amigo(a)"
//    }
//}
//
//fun app3(entrada: String) {
//    when (entrada) {
//        "victoria" -> {
//            println("A minha namorada")
//            println("Que eu amo muito!")
//        }
//        else -> println("Viver é mesmo assim.")
//    }
//}

///Loops
fun main(args: Array<String>){
    for (number in 2..<5000){
        printPrimos(number)
    }

    //rever primos printing
    println("\nnumeros primos em ordem decrescente")
    for (number in 5000 downTo 2){
        printPrimos(number)
    }

    codidoFuncional()
}

fun printPrimos(number: Int){
    var isPrimo = true
    for (index in 2..< number){
       if(number % index == 0){
           isPrimo = false
           break
       }
    }
    if(isPrimo) print("$number, ")
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