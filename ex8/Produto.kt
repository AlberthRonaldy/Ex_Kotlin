package ex8

class Produto(val nome: String, var quantidade: Int, val nivelMinimo: Int, val nivelMaximo: Int) {

    fun reporEstoque() {
        if (quantidade < nivelMinimo) {
            println("Reposição de estoque para o produto '$nome'")
            quantidade = nivelMaximo
            println("Estoque reabastecido para o nível máximo de $nivelMaximo")
        }
    }

    fun verificarEstoque() {
        println("Produto: $nome")
        println("Quantidade disponível: $quantidade")
        println("Nível mínimo: $nivelMinimo")
        println("Nível máximo: $nivelMaximo")

        if (quantidade < nivelMinimo) {
            println("A quantidade está abaixo do nível mínimo")
            reporEstoque()
        } else {
            println("Quantidade suficiente")
        }

        println()
    }
}