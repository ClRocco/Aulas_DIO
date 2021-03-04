package one.digitalinnovation.digitalbank.testes

import one.digitalinnovation.digitalbank.Pessoa

fun main(){
    val jether = Pessoa("Claudio", "808.946.157-34")

    //jether.nome = "852" -- ) private set não permite escrever nesta variável

    //println(jether.nome)
    //println(jether.cpf)

    println(jether.PessoaInfo())
}