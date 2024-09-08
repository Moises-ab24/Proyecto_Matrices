/*
Un examen final consta de 12 preguntas de selección única.
Para cada pregunta existen 4 opciones de respuesta a elegir: a  b  c  d.
El estudiante será calificado en una escala de 0 a 100 de acuerdo a sus respuestas.
 */

class Examen(val nombres: Array<String>) {
    val plantilla: Array<Char> = arrayOf('a', 'c', 'b', 'a', 'd', 'b', 'b', 'c', 'a', 'a', 'b', 'd')
    val notas: FloatArray = FloatArray(4)
    val respuestas: Array<CharArray> = Array(4) { CharArray(12) }
    var contador: Int = 0

    init {
        nombres.size == 4
    }

    fun leerRespuestas(respuestasEstudiante: CharArray) {
        if (contador < 4) {
            respuestas[contador] = respuestasEstudiante
            contador++
        }
    }

    fun comprobador() { //Comprobar si se guardan en sus respectivos lugares
        for (i in 0 until contador) {
            println("${nombres[i]}")
            println("${respuestas[i].joinToString(" ")}")
        }
    }
}

fun main() {
    val Cons = Examen(arrayOf("Marta", "Pedro", "Juan", "María"))
    Cons.leerRespuestas(charArrayOf('a', 'c', 'b', 'a', 'd', 'b', 'b', 'c', 'a', 'a', 'b', 'd'))
    Cons.leerRespuestas(charArrayOf('b', 'c', 'b', 'd', 'd', 'b', 'b', 'a', 'b', 'd', 'b', 'd'))
    Cons.leerRespuestas(charArrayOf('c', 'c', 'b', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'b', 'c'))
    Cons.leerRespuestas(charArrayOf('c', 'c', 'b', 'a', 'd', 'b', 'b', 'c', 'a', 'a', 'b', 'c'))
    Cons.comprobador()
}