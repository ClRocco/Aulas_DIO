package one.digitalinnovation.digitalbank

class Cliente(
        nome: String,
        cpf: String,
        val clienteTipo : ClienteTipo,
        val senha: String
) : Pessoa(nome, cpf), Logavel {
    override fun Login(): Boolean = "123456" == senha

    override fun toString(): String = """
        Nome: $nome
        CPF:  $cpf
        Tipo: ${clienteTipo.descricao}
    """.trimIndent()
}