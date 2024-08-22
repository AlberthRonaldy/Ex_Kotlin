package ex8

fun main() {
    val produtos = mutableListOf<Produto>()

    for (i in 1..5) {
        println("Cadastro do produto $i:")
        print("Digite o nome do produto: ")
        val nome = readln()
        print("Digite a quantidade disponível: ")
        val quantidade = readln().toInt()
        print("Digite o nível mínimo: ")
        val nivelMinimo = readln().toInt()
        print("Digite o nível máximo: ")
        val nivelMaximo = readln().toInt()

        val produto = Produto(nome, quantidade, nivelMinimo, nivelMaximo)
        produtos.add(produto)
        println()
    }

    for (produto in produtos) {
        produto.verificarEstoque()
    }
}
