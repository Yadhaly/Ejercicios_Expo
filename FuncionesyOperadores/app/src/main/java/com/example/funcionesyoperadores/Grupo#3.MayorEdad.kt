package com.example.funcionesyoperadores

fun main(){
    val persona = MayorEdad()
    print("Ingrese su edad: ")
    val edad = readLine()!!.toInt()
    val resultado = persona.verificarEdad(edad)
    println(resultado)
}