package one.digitalinnovation.collections

fun main() {
    val joao  = Funcionario("Joao", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "CLT")
    val maria = Funcionario("Maria", 4000.0, "PJ")

    val funcionarios = mutableListOf(joao, maria)
    // Funciona igual ao listOf() //
    funcionarios.forEach { println("Lista normal $it") }

    // mutableList permite adicionar novos itens na lista //
    funcionarios.add(pedro)
    println("\nUm funcionario adicionado")
    funcionarios.forEach { println("Lista com mais um funcionário $it") }

    // mutableList permite retirar itens da lista //
    funcionarios.remove(joao)
    println("\nUm funcionario removido")
    funcionarios.forEach { println("Lista com menos um funcionário $it") }

    // Conjuntos de lista //
    println("\nConjuntos de lista")
    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach { println("Lista de funcionários usando o setOf $it") }

    // Adiciona funcionários no conjunto //
    println("\nAdiciona funcionários no conjunto")
    funcionarioSet.add(pedro)
    funcionarioSet.add(maria)
    funcionarioSet.forEach { println("Lista de funcionários adicionados ao setOf $it") }

    // Remove um funcionário no conjunto //
    println("\nRemove um funcionário no conjunto")
    funcionarioSet.remove(maria)
    funcionarioSet.forEach { println("Lista de funcionários com exclisão no setOf $it") }
}