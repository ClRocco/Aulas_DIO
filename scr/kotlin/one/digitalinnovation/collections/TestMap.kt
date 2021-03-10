package one.digitalinnovation.collections

fun main() {
    val pair: Pair<String, Double> = Pair("Joao", 1000.0)
    val map1 = mapOf(pair)

    println("Exemplo de mapa")
    map1.forEach { (k, v) -> println("Chave: $k  Valor: $v")}

    // Outro modo de criar um mapa //
    val map2 = mapOf(
        "Pedro" to 2500.0,
        "Maria" to 3000.0
    )
    println("\nOutro modo de criar um mapa")
    map2.forEach { (k, v) -> println("Chave: $k  Valor: $v")}
}