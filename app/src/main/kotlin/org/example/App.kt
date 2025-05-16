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
    println("Tabla de valores (f(x) = ax² + bx + c):")
    println("----------------------------------------")
    println("|   x   |         f(x)                 |")
    println("----------------------------------------")
fun calcularFuncion(a: Int, b: Int, c: Int, x: Int): Int {
    return a * x * x + b * x + c
}
    for (x in -5..5) {
        val y = calcularFuncion(a, b, c, x)
        println(String.format("| %5d | %25d |", x, y))
        }
    println("----------------------------------------\n")
    }



