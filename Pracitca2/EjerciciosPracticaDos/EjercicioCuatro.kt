fun main() {
    val numbers = IntArray(4)
    for (i in numbers.indices) {
        while (true) {
            try {
                print("Ingresar el numero ${i + 1}: ")
                val input = readLine()!!
                numbers[i] = input.toInt()
                break
            } catch (e: NumberFormatException) {
                println("Caracter no valido. Por favor, ingresar un numero.")
            }
        }
    }

    val numeroMayor = numero.mayorOrNull() ?: 0
    println("El numero mayor del array es: $numeroMayor")
}
