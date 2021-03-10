package one.digitalinnovation.collections

fun main(){
    val joao  = Funcionario("Joao", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "CLT")
    val maria = Funcionario("Maria", 4000.0, "PJ")

    val funcionarios = listOf(joao, pedro, maria)
    println("Mostra a lista de funcionários")
    funcionarios.forEach{
        println(it)
    }

    println("\nImprime um funcionário especificado")
    println(funcionarios.find { it.nome == "Maria" })

    println("\nImprime os funcionário ordenados por um dos itens")
    funcionarios.sortedBy { it.salario }.forEach { println(it) }

    println("\nImprime os funcionário ordenados por grupo")
    funcionarios.groupBy { it.tipoContratacao }.forEach { println(it) }
}
