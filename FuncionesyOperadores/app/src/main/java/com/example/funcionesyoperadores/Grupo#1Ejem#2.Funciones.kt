package com.example.funcionesyoperadores

val variableGlobal = "Hola soy una Variable Global."

fun main () {
    print("Ingrese el numero 1: ")
    val numero1 : Int = readln().toInt()

    print("Ingrese el numero 2: ")
    val numero2 : Int = readln().toInt()

    print("Elija la operacion que quiere realizar: ")
    val operador : String = readln().toString()

    suma(valor1 = numero1, valor2 = numero2)
    resta(valor1 = numero1, valor2 = numero2)
    multiplicacion(valor1 = numero1, valor2 = numero2)
    division(valor1 = numero1, valor2 = numero2)
    println(variableGlobal)
}

fun suma (valor1: Int, valor2: Int) {
    println("$valor1 + $valor2 = ${valor1+valor2}")
}

fun resta (valor1: Int, valor2: Int) {
    println("$valor1 - $valor2 = ${valor1-valor2}")
}

fun multiplicacion (valor1: Int, valor2: Int) {
    println("$valor1 * $valor2 = ${valor1*valor2}")
}

fun division (valor1: Int, valor2: Int) {
    println("$valor1 / $valor2 = ${valor1/valor2}")
}