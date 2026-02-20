package com.example.funcionesyoperadores

fun main(){
    val dia = DiaSemana()
    print("Ingrese un numero del 1 al 7 para determinar el dia de la semana: ")
    val numero = readLine()!!.toInt()
    val resultado = dia.obtenerDia(numero)
    println(resultado)
}