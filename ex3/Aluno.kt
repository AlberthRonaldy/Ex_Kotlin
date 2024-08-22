package ex3

class Aluno(
    val nome: String,
    private val notas: DoubleArray
) {
    fun calcularMedia(): Double {
        return notas.average()
    }

    fun aprovado(): Boolean {
        return calcularMedia() >= 7.0
    }
}
