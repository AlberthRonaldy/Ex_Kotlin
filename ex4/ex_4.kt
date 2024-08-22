package ex4

fun main() {
    val nomes = Array(10) { "" }

    println("Digite o nome de 10 alunos")

    for (i in nomes.indices) {
        print("Nome do aluno ${i + 1}: ")
        nomes[i] = readlnOrNull()?.trim() ?: ""
    }

    nomes.sort()

    println("\nLista de alunos em ordem alfabética:")
    for ((index, nome) in nomes.withIndex()) {
        println("Aluno ${index + 1}: $nome")
    }
}