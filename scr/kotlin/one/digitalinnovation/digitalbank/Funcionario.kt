package one.digitalinnovation.digitalbank

import java.math.BigDecimal

abstract class Funcionario(     // Classe abstrata não pode ser instanciada.
        nome: String,           // Ela pode ser apenas utilizada em outras classes
        cpf: String,            // Como é Pessoa é abstrata, as suas variáveis passam a fazer parte desta classe tbm.
        val salario: Double,
) : Pessoa(nome, cpf) {
    protected abstract fun calculoAuxilio() : Double    // Apenas esta classe as as clases filhas pode acessar.

   override fun toString(): String = """ 
        Nome: $nome
        Cpf: $cpf
        Salario: $salario
        Auxilio: ${calculoAuxilio()}
        """.trimIndent()

}