package ex7

class Voo(val numeroDoVoo: String, val assentosDisponiveis: IntArray) {

    fun reservarAssento(assento: Int): Boolean {
        // verifica se o assento está dentro do intervalo
        if (assento < 0 || assento >= assentosDisponiveis.size) {
            println("Número de assento inválido.")
            return false
        }

        return if (assentosDisponiveis[assento] == 1) {
            assentosDisponiveis[assento] = 0
            println("Assento $assento reservado com sucesso.")
            true
        } else {
            println("Assento $assento já está reservado.")
            false
        }
    }

    fun verificarDisponibilidade(assento: Int): Boolean {
        if (assento < 0 || assento >= assentosDisponiveis.size) {
            println("Número de assento inválido.")
            return false
        }
        return assentosDisponiveis[assento] == 1
    }
}
