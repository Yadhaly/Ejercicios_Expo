

package com.example.funcionesyoperadores

class Estudiante (val nombre: String?, var nota1: Double, var nota2: Double, var nota3: Double){

    fun calcularPromedio(): Double{
        return (nota1 + nota2 + nota3) / 3
    }

    fun aprobo(): Boolean{
        return calcularPromedio() >= 65
    }

    fun mostrarInformacion(){
        println("Estudiante: $nombre")
        println("Promedio: ${calcularPromedio()}%")
        println("Aprobo: ${aprobo()}")
    }
}


fun main(){
    println("Ingrese el nombre del Estudiante:")
    val nombre = readln().toString()

    println("Ingrese las notas: ")
    val n1 = readln().toDouble()
    val n2 = readln().toDouble()
    val n3 = readln().toDouble()

    val estudiante = Estudiante (nombre, nota1 = n1, nota2 = n2, nota3 = n3)
    estudiante.mostrarInformacion()
}