package com.example.funcionesyoperadores

fun main() {

    val juego = NumeroSecreto()
7
    println("Ingrese su numero: ")
    val num = readln().toInt()

    val resultado = juego.verificarNumero(num)

    if (resultado) {
        println("Correcto, Adivinaste el numero secreto.")
    } else {
        println("Incorrecto. Intenta nuevamente.")
    }
}

class NumeroSecreto {

    private val numeroSecreto = 7

    fun verificarNumero(numero: Int): Boolean {
        return numero == numeroSecreto
    }
}