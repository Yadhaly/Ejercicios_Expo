package com.example.funcionesyoperadores

class Rectangulo(val base: Double, val altura: Double) {

    fun calcularArea(): Double {
        return base * altura
    }
}

 /*//Dando los datos ya determinados
fun main(){
    val recta = Rectangulo(base= 5.0, altura = 3.0)
    println("El area es: ${recta.calcularArea()}")*/

/* //Dandole a ingresar los datos
fun main() {

    print("Ingrese la base del rectangulo: ")
    val base = readLine()!!.toDouble()

    print("Ingrese la altura del rectangulo: ")
    val altura = readLine()!!.toDouble()

    val rect = Rectangulo(base, altura)

    println("El area es: ${rect.calcularArea()}")
}*/