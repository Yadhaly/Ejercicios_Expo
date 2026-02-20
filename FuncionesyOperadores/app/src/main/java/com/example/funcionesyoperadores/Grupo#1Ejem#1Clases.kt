package com.example.funcionesyoperadores

class Persona(val nombre: String, val edad: Int) {
    val mensaje = "Hola, mi nombre es $nombre y tengo $edad anios."
}

fun main() {

    print("Ingrese su nombre: ")
    val nombre = readLine() ?: ""

    print("Ingrese su edad: ")
    val edadInput = readLine() ?: "0"
    val edad = edadInput.toIntOrNull() ?: 0

    val persona = Persona(nombre, edad)

    println(persona.mensaje)
}
