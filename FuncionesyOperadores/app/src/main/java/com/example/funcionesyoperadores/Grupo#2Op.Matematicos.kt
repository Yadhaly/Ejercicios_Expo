package com.example.funcionesyoperadores

fun main() {

    val op = Operaciones()

    println("----- MENU DE OPERACIONES -----")
    println("1. Suma")
    println("2. Resta")
    println("3. Multiplicacion")
    println("4. Division")
    println("5. Multiple (a + b * c)")
    println("6. Multiple2 (a - b / c)")
    print("Seleccione una opcion: ")

    val opcion = readln().toInt()

    when (opcion) {

        1 -> {
            print("Ingrese el primer numero: ")
            val a = readln().toInt()
            print("Ingrese el segundo numero: ")
            val b = readln().toInt()
            println("Resultado: ${op.suma(a, b)}")
        }

        2 -> {
            print("Ingrese el primer numero: ")
            val a = readln().toInt()
            print("Ingrese el segundo numero: ")
            val b = readln().toInt()
            println("Resultado: ${op.resta(a, b)}")
        }

        3 -> {
            print("Ingrese el primer numero: ")
            val a = readln().toInt()
            print("Ingrese el segundo numero: ")
            val b = readln().toInt()
            println("Resultado: ${op.multiplicacion(a, b)}")
        }

        4 -> {
            print("Ingrese el primer numero: ")
            val a = readln().toInt()
            print("Ingrese el segundo numero: ")
            val b = readln().toInt()
            println("Resultado: ${op.division(a, b)}")
        }

        5 -> {
            print("Ingrese el primer numero: ")
            val a = readln().toInt()
            print("Ingrese el segundo numero: ")
            val b = readln().toInt()
            print("Ingrese el tercer numero: ")
            val c = readln().toInt()
            println("Resultado: ${op.multiple(a, b, c)}")
        }

        6 -> {
            print("Ingrese el primer numero: ")
            val a = readln().toInt()
            print("Ingrese el segundo numero: ")
            val b = readln().toInt()
            print("Ingrese el tercer numero: ")
            val c = readln().toInt()
            println("Resultado: ${op.multiple2(a, b, c)}")
        }

        else -> println("Opcion no valida.")
    }
}

class Operaciones {

    fun suma(a: Int, b: Int) = a + b

    fun resta(a: Int, b: Int) = a - b

    fun multiplicacion(a: Int, b: Int) = a * b

    fun division(a: Int, b: Int) = a / b

    fun multiple(a: Int, b: Int, c: Int) = a + b * c

    fun multiple2(a: Int, b: Int, c: Int) = a - b / c
}
