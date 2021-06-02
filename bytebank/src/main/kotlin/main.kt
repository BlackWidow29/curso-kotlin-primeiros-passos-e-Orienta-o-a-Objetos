fun main() {

    println("Bem vindo ao bytebank")
    val titular: String = "Isabelly Dias"
    val numeroConta: Int = 1000
    var saldo = 0.0
    saldo = 100 + 2.0
    saldo += 200

    println("Titular $titular")
    println("Número de conta $numeroConta")
    println("Saldo da conta $saldo")

    testaCondicoes(saldo)
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