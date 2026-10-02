fun pedirBooleano(mensaje: String): Boolean {
    print(mensaje)
    return readln().toBoolean()
}

fun estado1(a: Boolean, b: Boolean): Int {
    val estado = 1
    return estado
}

fun estado2(a: Boolean, b: Boolean): Int {
    val estado = 2
    return estado
}

fun estado3(a: Boolean, b: Boolean): Int {
    val estado = 3
    return estado
}

fun estado4(a: Boolean, b: Boolean): Int {
    val estado = 4
    return estado
}

fun estado0(a: Boolean, b: Boolean): Int {
    val estado = 0
    return estado
}

fun gestorEstado(a: Boolean, b: Boolean, estadoInicial: Int): Int {
    var estado = estadoInicial

    if (a) {
        estado = estado2(a, b)
        println(estado)

        val nuevoA = pedirBooleano("Introduce a (true/false): ")
        val nuevoB = pedirBooleano("Introduce b (true/false): ")

        if (nuevoB) {
            println(estado4(nuevoA, nuevoB))
            estado = estado1(nuevoA, nuevoB)
            println(estado)
        } else {
            println(estado3(nuevoA, nuevoB))
            estado = estado0(nuevoA, nuevoB)
            println(estado)
        }
    }

    return estado
}

fun main() {
    var estado: Int = 1

    val a = pedirBooleano("Introduce a (true/false): ")
    val b = pedirBooleano("Introduce b (true/false): ")

    estado = gestorEstado(a, b, estado)
    println("Estado final: $estado")
}