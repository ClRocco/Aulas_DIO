package one.digitalinnovation.digitalbank

class Pessoa {
    var nome = "Claudio"
    var cpf: String = "808.946.157-34"
}
fun main(){
    val jether = Pessoa()
    println(jether.nome)
    println(jether.cpf)
}