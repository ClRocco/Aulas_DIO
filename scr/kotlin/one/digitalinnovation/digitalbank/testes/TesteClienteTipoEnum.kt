package one.digitalinnovation.digitalbank.testes

import one.digitalinnovation.digitalbank.ClienteTipo

fun main(){
    println("Número de parametros = ${ClienteTipo.GetNumParameters()}")
    ClienteTipo.PrintParameters()

    var clienteTipo = ClienteTipo.pf
    println("\nTipo de cliente é: ${clienteTipo.descricao}")

    clienteTipo = ClienteTipo.pj
    println("\nTipo de cliente é: ${clienteTipo.descricao}")
}