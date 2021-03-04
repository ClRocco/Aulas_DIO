package one.digitalinnovation.digitalbank

class Pessoa {
    var nome = "Claudio"
    var cpf: String = "808.946.157-34"

    inner class Endereco{
        var rua: String = "Rua Dom Antônio de Macedo"
    }
}
fun main(){
    val jether = Pessoa()
    println(jether.nome)
    println(jether.cpf)

    println(jether.Endereco().rua)
}

