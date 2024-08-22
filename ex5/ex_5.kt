package ex5

import kotlin.random.Random

fun main() {
    print("Quantas vezes você deseja lançar os dados? ")
    val quantidadeLances = readlnOrNull()?.toIntOrNull() ?: 0

    if (quantidadeLances <= 0) {
        println("Número inválido, o programa vai finalizar")
        return
    }

    repeat(quantidadeLances) { lance ->
        val dado1 = Random.nextInt(1, 7) // Gera um número aleatório de 1 a 6
        val dado2 = Random.nextInt(1, 7)
        val soma = dado1 + dado2
        println("${lance + 1}° lançamento: Os dados sorteados foram [$dado1, $dado2]. A Soma foi de $soma")
    }
}
