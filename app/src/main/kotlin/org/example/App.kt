package org.example
import kotlin.math.sqrt
fun main() {
    val a = 2
    val b = 5
    val c = -3    // Validación: a no puede ser 0 en una ecuación cuadrática
    if (a == 0) {
        println("El coeficiente 'a' no puede ser cero. No es una ecuación cuadrática.")
        return
    }    // Mostrar la función en forma estándar
    val funcion = buildString {
        append("${a}x² ")
        append(if (b >= 0) "+ $b" else "- ${-b}")
        append("x ")
        append(if (c >= 0) "+ $c" else "- ${-c}")
    }    println("Función ingresada:")
    println("  f(x) = $funcion = 0\n")    // Tabla de valores de la función
    println("Tabla de valores (f(x) = ax² + bx + c):")
    println("----------------------------------------")
    println("|   x   |         f(x)                 |")
    println("----------------------------------------")
    for (x in -5..5) {
        val y = calcularFuncion(a, b, c, x)
        println(String.format("| %5d | %25d |", x, y))
    }
    println("----------------------------------------\n")    // Cálculo del discriminante
    val d = calcularDiscriminante(a, b, c)
    println("Cálculo del discriminante:")
    println("  D = b² - 4ac = $b² - 4($a)($c) = $d\n")    // Evaluación de las raíces según el discriminante
    calcularRaices(a, b, d)
}// Función que evalúa f(x) = ax² + bx + c
fun calcularFuncion(a: Int, b: Int, c: Int, x: Int): Int {
    return a * x * x + b * x + c
}// Función que calcula el discriminante
fun calcularDiscriminante(a: Int, b: Int, c: Int): Int {
    return b * b - 4 * a * c
}// Función que determina las raíces dependiendo del valor del discriminante
fun calcularRaices(a: Int, b: Int, d: Int) {
    when {
        d > 0 -> {
            val x1 = (-b + sqrt(d.toDouble())) / (2 * a)
            val x2 = (-b - sqrt(d.toDouble())) / (2 * a)
            println("Tipo de raíces: Reales y diferentes (D > 0)")
            println("  x₁ = %.2f".format(x1))
            println("  x₂ = %.2f".format(x2))
        }
        d == 0 -> {
            val x = -b.toDouble() / (2 * a)
            println("Tipo de raíz: Real y doble (D = 0)")
            println("  x = %.2f".format(x))
        }
        else -> {
            println("Tipo de raíces: Complejas (no reales) (D < 0)")
            println("  No existen soluciones reales.")
        }
    }
     //Mensaje final indicando el fin del programa
    println("\n--- Fin del programa ---.")
}


