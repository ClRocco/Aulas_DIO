package one.digitalinnovation.digitalbank

enum class ClienteTipo(var descricao:String) { // É necessário ter var ou val para o argumento ficar visível
    pf("Pessoa Física"),
    pj("Pessoa Jurídica");

    companion object {              // permite a criação de funções estáticas em seu escopo.
                                    // Estas funções podem ser acessadas diretamente sem ser instanciadas.

        fun PrintParameters() = ClienteTipo.values().forEach { elemento -> println("$elemento ${elemento.descricao}") }

        // pode ser usado 'it' ao inves de definir a variavel 'elemento'
        //fun PrintParameters() = ClienteTipo.values().forEach { println("$it ${it.descricao}") }

        fun GetNumParameters() = ClienteTipo.values().size
    }
}