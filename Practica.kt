fun fibonacci(n: Int): Int {
    return if (n <= 1) {
        n
    } else {
        fibonacci(n-1) + fibonacci(n-2)
    }
}

fun sumaRecursiva(n: Int): Int {
    return if (n <= 1) {
        n
    } else {
        n + sumaRecursiva(n-1)
    }
}

fun sumaLista(lista: List<Int>): Int {
    return if (lista.isEmpty()) {
        0
    } else {
        lista[0] + sumaLista(lista.drop(1))
    }
}

fun main(args: Array<String>) {
    // Ejemplo 1: Fibonacci
    val numero = 15
    val numerosLista = listOf(1, 2, 3, 4)
    println("Ejemplo 1")
    println("Fibonacci de $numero es: ${fibonacci(numero)}")

    println("\nEjemplo 2")
    println("La suma de 1 a $numero es: ${sumaRecursiva(numero)}")

    println("\nEjemplo 3")
    println("La suma de la lista es: ${sumaLista(numerosLista)}")
}
