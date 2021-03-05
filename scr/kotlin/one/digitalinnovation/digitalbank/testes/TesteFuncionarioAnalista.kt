package one.digitalinnovation.digitalbank.testes

import one.digitalinnovation.digitalbank.Analista
import one.digitalinnovation.digitalbank.Funcionario

fun main(){
    val joao = Analista("João", "808.946.157-34", 3500.0)

   ImprimeRelatorio(joao)
}

private fun ImprimeRelatorio(funcionario : Funcionario) = println(funcionario.toString())