package ex6

fun main() {
    val temperaturas = IntArray(30)

    println("Digite as temperaturas diárias para um mês de 30 dias:")

    for (i in temperaturas.indices) {
        while (true) {
            print("Temperatura do dia ${i + 1}: ")
            val temperatura = readlnOrNull()?.toIntOrNull()
            if (temperatura != null) {
                temperaturas[i] = temperatura
                break
            } else {
                println("Temperatura inválida. Digite um número válido.")
            }
        }
    }

    val mediaTemperatura = temperaturas.average()
    val temperaturaMaxima = temperaturas.maxOrNull() ?: Int.MIN_VALUE
    val temperaturaMinima = temperaturas.minOrNull() ?: Int.MAX_VALUE

    val diasTemperaturaMaxima = temperaturas.indices.filter { temperaturas[it] == temperaturaMaxima }.map { it + 1 }
    val diasTemperaturaMinima = temperaturas.indices.filter { temperaturas[it] == temperaturaMinima }.map { it + 1 }

    println("\nTemperatura média: %.2f".format(mediaTemperatura))
    println("Temperatura máxima: $temperaturaMaxima°C (Dia(s): ${diasTemperaturaMaxima.joinToString()})")
    println("Temperatura mínima: $temperaturaMinima°C (Dia(s): ${diasTemperaturaMinima.joinToString()})")
}