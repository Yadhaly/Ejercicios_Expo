package com.example.funcionesyoperadores

// del lateinit
lateinit var nombre: String

// del byLazy
val mensaje: String by lazy {
    println("Espere un momento...")
    "Hola, Yadh!!"
}

class manejodeDatos {

    fun filtrarEdades(edades: List<Int>): List<Int> {
        return edades.filter { it > 30 }
    }

    fun cantidadEdades(edades: List<Int>): Int {
        return edades.count { it > 30 }
    }

    fun ordenarNombres(nombres: List<String>): List<String> {
        return nombres.sorted()
    }

    fun ordenarEdadesDescendente(edades: List<Int>): List<Int> {
        return edades.sortedDescending()
    }

}

fun main() {

    val manejador = manejodeDatos()

    // ---------ORDENAMIENTO DE LISTAS---------//
    val edades = listOf(21, 24, 22, 22, 35, 40, 50, 25)
    val nombres = listOf("Aly", "Noe", "Yadh", "Maria", "Ale")

    println("Edades mayores a 24: " + manejador.filtrarEdades(edades))
    println("Cantidad de edades mayores a 24: " + manejador.cantidadEdades(edades))

    println("\nNombres ordenados: " + manejador.ordenarNombres(nombres))
    println("Edades ordenadas de manera descendente: " + manejador.ordenarEdadesDescendente(edades))}



    //------------------LISTAS MUTABLES----------//
    /*val verduras = mutableListOf("coliflor", "brocoli", "tomate", "papa", "cebolla")

    print("\nLista inicial de verduras: " + verduras)

    verduras.add("remolacha")
    verduras.remove("brocoli")
    verduras[0] = "repollo"
    verduras.add("berenjena")

    println("\nLista modificada de verduras: " + verduras)


    //------------------MAPS O DICCIONARIOS-------------//

    val edades = mutableMapOf(
        "Ale" to 23,
        "Noe" to 30,
        "Carlos" to 28
    )
    println(edades)
    edades["Ale"] = 25 // Modificamos la edad
    println("Edad Ale nuevo: "+edades["Ale"])
    println("Edad Noe viejo: "+edades["Noe"])

    edades["Baide"]=28
    println(edades)

    edades.remove("Noe")
    println(edades)


    //--------Transformaciones-------//
//Maps
    val numeros = listOf(1,2,3,4)
    val cuadrados = numeros.map{it*3}
    println("NUMEROS: "+numeros)
    println("CUADRADOS: "+cuadrados)
//ZIPS

    val nombres = listOf("Ale", "Noe", "Yadh")
    val edades = listOf(25, 30, 28)
    val nombres_edades = nombres.zip(edades)

    println(nombres)
    println(edades)
    println(nombres_edades)

//FLATTEN

    val listas = listOf(
        listOf(1, 2),
        listOf(3, 4),
        listOf(5)
    )

    val todo_junto = listas.flatten()
    println(listas)
    println(listas[0])
    println(listas[1])
    println(listas[2])
    println(todo_junto)

    // Ordenamiento por una propiedad (sortedBy)
    data class Usuario(
        val nombre: String,
        val edad: Int
    )

    val usuarios = listOf(
        Usuario("Ale", 25),
        Usuario("Noe", 24),
        Usuario("Yadh", 22)
    )

    val usuariosOrdenados = usuarios.sortedBy { it.nombre }

    println("Usuarios sin ordenar: ")
    for (usuario in usuarios) {
        println(usuario.nombre + ", " + usuario.edad)
    }

    println("\nUsuarios ordenados por edad: ")
    for (usuario in usuariosOrdenados) {
        println(usuario.nombre + ", " + usuario.edad)
    }



    //Lateinit
    nombre = "Ale" // Asignamos un valor a la variable nombre
    println("El nombre es: " + nombre)


    // by lazy
    println("Antes del mensaje")
    println(mensaje)

    println("\nDespues del mensaje")
    println(mensaje)
}*/



