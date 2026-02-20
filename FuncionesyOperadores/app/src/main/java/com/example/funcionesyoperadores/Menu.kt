package com.example.funcionesyoperadores

class Menu {


    fun mostrarMenu() {

        var opcion: Int

        do {

            println("---- MENU ----")
            println("1. Saludar")
            println("2. Salir")

            print("Seleccione: ")

            opcion = readLine()!!.toInt()

            when (opcion) {

                1 -> println("Hola usuario")
                2 -> println("Saliendo...")

                else -> println("Opcion incorrecta")

            }

        } while (opcion != 2)

    }


}