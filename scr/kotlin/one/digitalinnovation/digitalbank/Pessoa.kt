package one.digitalinnovation.digitalbank

class Pessoa {
    var nome = "Claudio"
    var cpf: String = "808.946.157-34"
    private set // Só permite a a variável acima só pode ser alterado dentro da própria classe.

}
fun main(){
    val jether = Pessoa()
    //jether.nome = "852" -- ) private set não permite escrever nesta variável
    println(jether.nome)
    println(jether.cpf)

}

