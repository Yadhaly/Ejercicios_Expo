package com.example.funcionesyoperadores

fun main() {
    print("Ingrese un numero: ")
    val numero = readln().toInt()
    val contadora = Contadora(numero)
    contadora.contar()
}