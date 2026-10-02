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

    if (a && estado == 1) {
        estado = estado2(a, b)
        println(estado)


    }
     else if(estado == 2) {

        if (b) {
            println(estado4(a, b))
            estado = estado1(a, b)
        } else {
            println(estado3(a, b))
            estado = estado0(a, b)
        }
    }

    return estado
}

fun main() {
    var estado: Int = 1

    val a = pedirBooleano("Introduce a (true/false): ")
    val b = pedirBooleano("Introduce b (true/false): ")

    estado = gestorEstado(a, b, estado)

    val a2 = pedirBooleano("Introduce a (true/false): ")
    val b2 = pedirBooleano("Introduce b (true/false): ")

    estado = gestorEstado(a2, b2, estado)
    println("Estado final: $estado")
}