package ex1

fun isPrime(num: Int): Boolean {
    if (num < 2) return false
    if (num == 2 || num == 3) return true
    if (num % 2 == 0 || num % 3 == 0) return false

    // números menores já foram verificados
    var i = 5
    while (i * i <= num) {
        if (num % i == 0 || num % (i + 2) == 0) return false
        i += 6
    }
    return true
}

fun main() {
    print("Digite um número inteiro: ")
    val num = readln().toInt()

    val resultado = if (isPrime(num)) "é primo" else "não é primo"
    println("O número $num $resultado")
}
