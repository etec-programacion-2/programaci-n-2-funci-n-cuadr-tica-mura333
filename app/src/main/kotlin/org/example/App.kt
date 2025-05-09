


fun calcularRaices(a: Double, b: Double, c: Double) {
    val discriminante = b * b - 4 * a * c

    if (discriminante > 0) {
        val raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a)
        val raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a)
        println("Raíces reales distintas: %.2f y %.2f".format(raiz1, raiz2))
    } else if (discriminante == 0.0) {
        val raiz = -b / (2 * a)
        println("Raíz doble: %.2f".format(raiz))
    } else {
        val parteReal = -b / (2 * a)
        val parteImaginaria = Math.sqrt(-discriminante) / (2 * a)
        println("Raíces complejas: %.2f + %.2fi y %.2f - %.2fi".format(parteReal, parteImaginaria, parteReal, parteImaginaria))
    }
}

fun main() {
    val a = 1.0
    val b = -3.0
    val c = 2.0
    calcularRaices(a, b, c)
}

