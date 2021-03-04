package one.digitalinnovation.digitalbank.testes

import one.digitalinnovation.digitalbank.Banco

fun main() {
    val digiOneBank1 = Banco("DigiOne 1",12)
    // Também pode colocar o nome do arguemnto antes do valor, desse modo não precisa manter a ordem dos arqumentos.
    val digiOneBank2 = Banco(numero = 15, nome = "DigiOne 2")
    val bancoCopia1 = digiOneBank1.copy("DigiOne 1 - Copy") // Altera os dados originais.
    val bancoCopia2 = digiOneBank1.copy()                         // Faz uma cópia sem alteração.

    println("Banco: ${digiOneBank1.nome} \nNúmero: ${digiOneBank1.numero}")
    println("\n=====================================================\n")

    println("Banco: ${digiOneBank2.nome} \nNúmero: ${digiOneBank2.numero}")
    println("\n=====================================================\n")

    digiOneBank2.nome = "DigiOne 3"
    digiOneBank2.numero = 20
    println("Banco: ${digiOneBank2.nome} \nNúmero: ${digiOneBank2.numero}")
    println("\n=====================================================\n")

    println("Banco copia com alteração: ${bancoCopia1.nome} \nNúmero: ${bancoCopia1.numero}")
    println("\n=====================================================\n")

    println("Banco copia sem alteração: ${bancoCopia2.nome} \nNúmero: ${bancoCopia2.numero}")
    println("\n=====================================================\n")
}