package one.digitalinnovation.collections

fun main(){
    val salarios = DoubleArray(3)

    salarios[0] = 1000.0
    salarios[1] = 2000.0
    salarios[2] = 500.0

    println("\nSalários Modo 1")
    salarios.forEach {
        println("Salário = $it")
    }

    println("\nSalários Modo 1 - Pega o índice para poder fazer alteração no valor")
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
        println("Salário = ${salarios[index]}")
    }

    val salarios2 = doubleArrayOf(1500.0, 1250.0, 5000.0)
    println("\nSalários Modo 2 - Ordenados")
    salarios2.sort()
    salarios2.forEach {
        println("Salário2 = $it")
    }
}