
package org.example


fun main() {
    val a = 2
    val b = 5
    val c = -3    
    
        if (a == 0) {
        println("El coeficiente 'a' no puede ser cero.")
        return
    }    
    
    val funcion = buildString {
        append("${a}x² ")
        append(if (b >= 0) "+ $b" else "- ${-b}")
        append("x ")
        append(if (c >= 0) "+ $c" else "- ${-c}")
    }
}