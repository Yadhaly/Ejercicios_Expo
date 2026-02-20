package com.example.funcionesyoperadores

fun main(){
    val evaluador = Evaluador()

    print("Ingrese un numero: ")
    val numero = readLine()!!.toInt()

    val resultado = evaluador.evaluarNumero(numero)
    println(resultado)
}