import java.io.File

fun leerArchivos(ruta: String): String{
    val archivo = File(ruta)
    return archivo.readText()
}

fun escribirEnArchivos(ruta: String, content: String){
    val archivo = File(ruta)
    archivo.appendText(content)
} 

fun main(args: Array<String>) {
    
    val ruta = "C:/Users/PC/Desktop/Practicas de Estuctura de datos/Practica6/Documentos/archivo.txt"
    val contenido = leerArchivos(ruta)
    
    /*Ejemplo 1 - Lectura de Archivos */
    println(contenido)
    println("\n")

    /*Ejemplo 2 - Escritura en Archivosa */
    val escritura = " \nJUEGUEMOS WZZZ"
    

    escribirEnArchivos(ruta, escritura)
    println("Creado exitosamente.")
}
