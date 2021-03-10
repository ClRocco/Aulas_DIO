package one.digitalinnovation.collections

fun main(){
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    println("Modo normal")
    for(salario in salarios){
        println("Salário modo 1 = $salario")
    }

    println("\nModo de pesquisa 1")
    println("Acha o maior salário ${salarios.maxOrNull()}")
    println("Acha o menor salário ${salarios.minOrNull()}")
    println("Acha a média salarial ${salarios.average()}")

    println("\nCria uma cópia do array com as definições escolhidas")
    val salarioMaior2500 = salarios.filter { it > 2500.0 }
    salarioMaior2500.forEach{
        println("Salários maiores que 2500 = $it")
    }

    println("\nMostra a quantidade de salários que estão dentro de um RANGE de valores")
    println(salarios.count {it in 2000.0..5000.0})

    println("\nMostra um valor de salário escolhido")
    println(salarios.find {it == 2250.0})

    println("\nMostra um valor de salário escolhido Não existente")
    println(salarios.find {it == 10000.0})

    println("\nMostra se um valor de salário existe no array")
    println(salarios.any {it == 2250.0})

}