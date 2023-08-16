fun main() {
    println("Bem vindo ao Bytebank!")

    val titular: String = "Victor" // val == constante, ou seja, o valor nao pode ser alterado.

    var idade: Int = 24 // var == variavel, ou seja, o valor pode ser alterado.

    // var e val devem ser inicializadas.
    val numeroConta: Int = 1000
    var saldo: Double = 0.0

    println("Titular: $titular")
    println("Idade: $idade")
    println("Nro Conta: $numeroConta")
    println("Saldo: R$$saldo")
}