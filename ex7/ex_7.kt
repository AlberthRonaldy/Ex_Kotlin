package ex7

fun main() {
    val numeroDoVoo = "F134"
    // cria um voo com 10 assentos disponíveis (todos marcados como 1, 1 é para indicar que o assento está disponível)
    val assentosDisponiveis = IntArray(10) { 1 }
    val voo = Voo(numeroDoVoo, assentosDisponiveis)

    while (true) {
        println("\nMenu:")
        println("1. Verificar disponibilidade de assento")
        println("2. Reservar assento")
        println("3. Sair")
        print("Escolha uma opção: ")

        when (readlnOrNull()?.toIntOrNull()) {
            1 -> {
                print("Digite o número do assento para verificar: ")
                val assento = readlnOrNull()?.toIntOrNull()
                if (assento != null) {
                    if (voo.verificarDisponibilidade(assento)) {
                        println("Assento $assento está disponível")
                    } else {
                        println("Assento $assento não está disponível")
                    }
                } else {
                    println("Número de assento inválido")
                }
            }
            2 -> {
                print("Digite o número do assento para reservar: ")
                val assento = readlnOrNull()?.toIntOrNull()
                if (assento != null) {
                    voo.reservarAssento(assento)
                } else {
                    println("Número de assento inválido")
                }
            }
            3 -> {
                println("Programa finalizado")
                break
            }
            else -> {
                println("Opção inválida")
            }
        }
    }
}
