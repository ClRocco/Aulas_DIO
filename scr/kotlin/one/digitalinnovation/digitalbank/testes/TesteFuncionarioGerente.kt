package one.digitalinnovation.digitalbank.testes

import one.digitalinnovation.digitalbank.Gerente
import one.digitalinnovation.digitalbank.Funcionario

fun main(){
    val maria = Gerente("Maria", "808.946.157-34", 3500.0)

   ImprimeRelatorio(maria)
}

private fun ImprimeRelatorio(funcionario : Funcionario) = println(funcionario.toString())