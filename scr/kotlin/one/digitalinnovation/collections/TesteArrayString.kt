package one.digitalinnovation.collections

fun main(){
    //val nomes = Array<String>(3){""}
    //o Não é necessário especificar o tipo
    val nomes = Array(3){""}
    nomes[0] = "Maria"
    nomes[1] = "João"
    nomes[2] = "José"

    println("\nModo 1")
    for(nome in nomes){
        println("Nome modo 1 = $nome")
    }

    println("\nModo Ordenado")
    nomes.sort()
    nomes.forEach{
        println("Nome modo 2 - Ordenado = $it")
    }

    println("\nModo Ordenado, criado de outro modo")
    val nomes2 = arrayOf("Maria", "Zaza", "Pedro")
    nomes2.sort()
    nomes2.forEach{
        println("Nome modo 3 - Ordenado = $it")
    }
}