package com.example.funcionesyoperadores

fun main(){

    print("Ingrese un numero: ")
    val numero = readln().toInt()

    val verificador = Rango()

    println("----Operador AND----")
    println("Esta en el rango [10/20]?: ${verificador.estaEnRango(numero)}")

    println("----Operador OR-----")
    println("Es menor que 10 O mayor que 20?: ${verificador.estaFueraDeRango(numero)}")

    println("----Operador NOT----")
    println("No esta en el rango?: ${verificador.noEstaEnRango(numero)}")
}

class Rango {

    fun estaEnRango (numero: Int): Boolean{
        return numero > 10 && numero < 20
    }

    fun estaFueraDeRango(numero: Int): Boolean{
        return numero < 10 || numero > 20
    }

    fun noEstaEnRango(numero: Int): Boolean{
        return !(numero < 10 && numero > 20)
    }
}