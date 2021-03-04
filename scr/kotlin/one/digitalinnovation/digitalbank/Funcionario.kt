package one.digitalinnovation.digitalbank

import java.math.BigDecimal

class Funcionario(
        override val nome: String,  // Com override, o nome e o cpf na classe pessoa, é automaticamente preenchido.
        override val cpf: String,   // Se a variável em Pessoa for 'var' não precisa do 'override'
        val salario: BigDecimal
) : Pessoa(nome, cpf) {

}