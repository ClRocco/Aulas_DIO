package one.digitalinnovation.digitalbank.testes

import one.digitalinnovation.digitalbank.Cliente
import one.digitalinnovation.digitalbank.ClienteTipo
import one.digitalinnovation.digitalbank.TesteAutenticacao

fun main() {
    val jose = Cliente(
            nome = "José da Silva",
            cpf = "888.888.888-88",
            clienteTipo = ClienteTipo.pf,
            senha = "1213456"
    )

    println(jose)
    TesteAutenticacao().Autentica(jose)
}