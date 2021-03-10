package one.digitalinnovation.collections

fun main() {
    val joao  = Funcionario("Joao", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "CLT")
    val maria = Funcionario("Maria", 4000.0, "PJ")

    val repositorio = Repositorio<Funcionario>()
    repositorio.Create(joao.nome, joao)
    repositorio.Create(pedro.nome, pedro)
    repositorio.Create(maria.nome, maria)

    // Busca um funcionário pela chave //
    println(repositorio.FindById(joao.nome))

    println("** Mostra todos os ítens do mapa **")
    repositorio.FindAll().forEach { println(it) }

    println("** Remove um ítem do mapa **")
    repositorio.Remove(joao.nome)
    repositorio.FindAll().forEach { println(it) }
}