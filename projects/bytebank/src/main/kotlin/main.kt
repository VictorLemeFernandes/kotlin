fun main() {
    println("Bem vindo ao Bytebank!\n")

    var contaVictor = Conta()
    var contaCarlos = Conta()

    contaVictor.titular = "Victor"
    contaVictor.numero = 100
    contaVictor.saldo = 0.00

    println(contaVictor.titular)
    println(contaVictor.numero)
    println(contaVictor.saldo)

    contaVictor.depositar(150.0)

    println(contaVictor.saldo)

    if (contaVictor.transferir(contaCarlos, 125.0)) {
        println("Transferência bem sucedida!")
        println("Saldo atual: R$${contaVictor.saldo}")
    } else {
        println("Transferência falhou.")
    }
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0

    fun depositar(valorDepositado: Double) {
        saldo += valorDepositado
    }

    fun sacar(valorSacado: Double) {
        saldo -= valorSacado
    }

    fun transferir(contaDestino: Conta, valorTransferido: Double): Boolean {
        if (valorTransferido <= saldo) {
            contaDestino.depositar(valorTransferido)
            saldo -= valorTransferido
            return true
        }
        return false
    }
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