package com.example.funcionesyoperadores

class Validador {
    fun iniciarSesion(){
        val claveCorrecta = "1234"
        var clave = ""

        while (clave != claveCorrecta){
            print("Ingrese la contraseña: ")
            clave = readLine()!!

            if (clave != claveCorrecta){
                println("Contrasenia Incorrecta")
            }
        }

        println("Acceso Permitido")

    }
}