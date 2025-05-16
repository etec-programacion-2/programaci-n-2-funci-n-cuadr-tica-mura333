package org.example
import kotlin.math.sqrt
fun main() {
    val a = 2
    val b = 5
    val c = -3    
    if (a == 0) {
        println("El coeficiente 'a' no puede ser cero. No es una ecuación cuadrática.")
        return
    }    
    val funcion = buildString {
        append("${a}x² ")
        append(if (b >= 0) "+ $b" else "- ${-b}")
        append("x ")
        append(if (c >= 0) "+ $c" else "- ${-c}")
        println("Función ingresada:")
    }
        println("  f(x) = $funcion = 0\n")
}



