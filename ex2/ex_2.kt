package ex2

fun contarPalavras(texto: String): Int {
    if (texto.isBlank()) {
        return 0
    }

    val palavras = texto.trim().split("\\s+".toRegex())

    return palavras.size
}

fun main () {
    print("Digite um parágrafo de texto: ")
    val paragrafo = readlnOrNull()

    if (paragrafo != null) {
        val contagemPalavras = contarPalavras(paragrafo)
        println("O parágrafo contém $contagemPalavras palavras")
    } else {
        println("Entrada inválida. Por favor, insira um parágrafo de texto")
    }
}