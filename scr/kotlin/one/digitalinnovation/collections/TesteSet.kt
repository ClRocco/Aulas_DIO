package one.digitalinnovation.collections

fun main(){
    val joao  = Funcionario("Joao", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "CLT")
    val maria = Funcionario("Maria", 4000.0, "PJ")

    // Cria conjuntos com os funcionarios escolhidos de um array //
    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)

    // Faz a união dos conjuntos para serem usados de uma vez //
    println("Lista os conjuntos unidos")
    val resultUniao = funcionarios1.union(funcionarios2)
    resultUniao.forEach{ println(it) }

    // Extrai um conjunto de outro conjunto //
    println("\nLista de um conjunto com um item subtraido")
    val funcionarios3 = setOf(joao, pedro, maria)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach { println(it) }

    // Lista o que há de comum em dois conjuntos //
    println("\nLista de ítens que estão nos dois conjuntos")
    val resultIntesect = funcionarios3.intersect(funcionarios2)
    resultIntesect.forEach { println(it) }
}