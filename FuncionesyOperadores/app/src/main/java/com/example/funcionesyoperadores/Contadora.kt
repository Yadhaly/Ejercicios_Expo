package com.example.funcionesyoperadores

class Contadora(private val numero: Int) {

    fun contar() {
        for (i in 1..numero) {
            println(i)
        }
    }
}