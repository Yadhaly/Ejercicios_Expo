package com.example.funcionesyoperadores

class Evaluador{
    fun evaluarNumero(numero: Int): String{
        if (numero >= 0 ){
            return "El numero es Positivo"
        }
        return "El numero es Negativo"
    }
}