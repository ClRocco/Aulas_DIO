package one.digitalinnovation.digitalbank

open class Pessoa (                 // Usa-se 'open' na classe para poder usar 'open' nas variáveis.
        open val nome: String,      // Usa o 'open' para que esta variável possa ser 'override' por outra classe.
        open val cpf: String        // Se substituir o 'val' por 'var', pode omitir o 'open'.
        ) {
    // var nome: String = "Claudio"
    //var cpf: String = "808.946.157-34"
    //private set // Só permite a a variável acima só pode ser alterado dentro da própria classe.

    //constructor()   // Construtor secundário

    fun PessoaInfo() = " Nome: $nome \n CPF: $cpf"
}

