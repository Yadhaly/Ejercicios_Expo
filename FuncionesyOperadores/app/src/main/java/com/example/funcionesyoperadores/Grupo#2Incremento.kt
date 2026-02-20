package com.example.funcionesyoperadores

fun main() {

    print("Ingrese el numero inicial: ")
    val num = readln().toInt()

    val cont = Contador(num)

    println("Valor Inicial: ${cont.numero}")

    cont.incrementar()

    println("Valor Final: ${cont.numero}")
}

class Contador(var numero: Int) {

    fun incrementar() {
        numero++
    }
}
