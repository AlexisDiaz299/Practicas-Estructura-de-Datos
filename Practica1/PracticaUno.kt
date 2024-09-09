fun main() {
    println("Ingrese su primer número:")
    val numeroUno = readLine()?.toDoubleOrNull()

    println("Ingrese su segundo número:")
    val numeroDos = readLine()?.toDoubleOrNull()

    println("Ingrese la operación (+, -, *, /, ^):")
    val operacion = readLine()

    calculate(numeroUno, numeroDos, operacion)
}

fun calculate(numeroUno: Double?, numeroDos: Double?, operacion: String?) {
    if (numeroUno == null || numeroDos == null || operacion == null) {
        println("Error: Ingrese números válidos y una operación válida.")
        return
    }

    val resultado = when (operacion) {
        "+" -> numeroUno + numeroDos
        "-" -> numeroUno - numeroDos
        "*" -> numeroUno * numeroDos
        "/" -> {
            if (numeroDos == 0.0) {
                println("Error: División por cero no permitida.")
                return
            } else {
                numeroUno / numeroDos
            }
        }
        "^" -> Math.pow(numeroUno, numeroDos)
        else -> {
            println("Error: Operación no válida.")
            return
        }
    }

    println("Resultado de la operación $numeroUno $operacion $numeroDos = $resultado")
}
