package com.example.funcionesyoperadores

class MayorEdad {

    fun verificarEdad(edad: Int): String{

        if(edad >= 18){
            return "Eres Legal!!!"
        } else{
            return "No estoy para criar hijos"
        }
    }
}