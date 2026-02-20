package com.example.funcionesyoperadores

class ControlFlujo {

    fun ejemplo(numero: Int){

        if (numero < 0){
            println("Numero Invalido")
            return
        }

        for (i in 1..numero){

            if(i == 5){
                println("Se salto el 5")
                continue
            }

            if(i == 8){
                println("Se detuvo en el 8")
                break
            }

            println("Numero: $i")

        }

        println("Fin del Programa")

    }
}