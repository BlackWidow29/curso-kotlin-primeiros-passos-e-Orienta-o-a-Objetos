fun main() {

    println("Bem vindo ao bytebank")
    for (i in 1..5) {
        if (i == 4) {
            break
        }
        val titular: String = "Isabelly Dias $i"
        val numeroConta: Int = 1000 + i
        var saldo = 10.0 + i


        println("Titular $titular")
        println("Número de conta $numeroConta")
        println("Saldo da conta $saldo")
    }

    //testaCondicoes(saldo)

    testaBreakContinueLabel()
}


fun testaRepeticoes() {
    for (i in 1..5) {
        println("$i")
    }
    for (i in 10 downTo 1 step 2) {
        println("Ordem inversa $i")
    }

    var i = 0
    while (i < 5) {
        println("$i")
        i++
    }
}

fun testaBreakContinueLabel() {
    loop@ for (i in 1..100) {
        println("i = $i")
        for (j in 1..100) {
            println("j = $j")
            if (j == 6) break@loop
        }
    }
}

fun testaCondicoes(saldo: Double) {

//    if (saldo > 0.0){
//        println("Conta é positiva")
//    }
//    else if (saldo == 0.0){
//        println("Conta é neutra")
//    }
//    else{
//        println("Conta é negativa")
//    }

    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é neutra")
        else -> println("Conta é negativa")
    }
}