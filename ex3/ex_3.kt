package ex3

fun main() {
    val alunos = mutableListOf<Aluno>()

    for (i in 1..5) {
        println("Cadastro do Aluno $i")

        print("Digite o nome do aluno: ")
        val nome = readlnOrNull()?.trim() ?: ""

        print("Digite a quantidade de notas: ")
        val quantidadeNotas = readlnOrNull()?.toIntOrNull() ?: 0
        val notas = DoubleArray(quantidadeNotas)

        for (j in notas.indices) {
            while (true) {
                print("Digite a nota ${j + 1}: ")
                val nota = readlnOrNull()?.toDoubleOrNull()
                if (nota != null) {
                    notas[j] = nota
                    break
                } else {
                    println("Nota inválida, digite um número válido")
                }
            }
        }

        //adicioona a mutablelist de aluno
        val aluno = Aluno(nome, notas)
        alunos.add(aluno)

        println()
    }
    for (aluno in alunos) {
        val media = aluno.calcularMedia()
        val aprovado = if (aluno.aprovado()) "Aprovado" else "Reprovado"
        println("Nome: ${aluno.nome}")
        println("Média das Notas: %.2f".format(media))
        println("Status: $aprovado")
        println()
    }
}
