package one.digitalinnovation.digitalbank.testes

import one.digitalinnovation.digitalbank.Funcionario
import java.math.BigDecimal

fun main(){
    val jether = Funcionario("Claudio", "808.946.157-34", BigDecimal.valueOf(3500))

    println(jether.nome)
    println(jether.cpf)
    println(jether.salario)
}