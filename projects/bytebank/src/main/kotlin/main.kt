fun main() {
    println("Bem vindo ao Bytebank!")

    val titular: String = "Victor" // val == constante, ou seja, o valor nao pode ser alterado.

    var idade: Int = 24 // var == variavel, ou seja, o valor pode ser alterado.

    // var e val devem ser inicializadas.
    val numeroConta: Int = 1000
    var saldo: Double = 0.0

    saldo += 156.75

    println("Titular: $titular")
    println("Idade: $idade")
    println("Nro Conta: $numeroConta")
    println("Saldo: R$$saldo")

    //testaStatusConta(saldo)

    // printa 0, 1, 2
    for (i in 0 until 3) {
        println(i)
    }

    // printa 0, 1, 2, 3
    for (i in 0 .. 3) {
        println(i)
    }

    // printa 3, 2, 1, 0
    for (i in 3 downTo 0) {
        println(i)
    }

    var i = 0
    while (i < 5) {
        println("oi")
        i++
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