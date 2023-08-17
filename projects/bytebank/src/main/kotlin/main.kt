fun main() {
    println("Bem vindo ao Bytebank!\n")

    var contaVictor = Conta()
    contaVictor.titular = "Victor"
    contaVictor.numero = 100
    contaVictor.saldo = 1580.00

    println(contaVictor.titular)
    println(contaVictor.numero)
    println(contaVictor.saldo)
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
}

fun testaStatusConta(saldo: Double) {
    if (saldo > 0.0) {
        println("Conta positiva!")
    } else if (saldo == 0.0) {
        println("Conta neutra.")
    } else {
        println("Conta negativa.")
    }

    when {
        saldo > 0.0 -> println("Conta positiva!")
        saldo == 0.0 -> {
            println("Conta neutra.")
        }
        else -> println("Conta negativa.")
    }
}