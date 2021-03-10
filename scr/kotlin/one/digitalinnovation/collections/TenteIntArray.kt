package one.digitalinnovation.collections

fun main(){
    val values = IntArray(5)
    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    for(valor in values){
        println("Valor modo 1 = $valor")
    }

    println("\nTambém pode ser...")
    values.forEach{
        println("Valor modo 2 = $it")
    }

    println("\nTambém pode ser...")
    values.forEach{ valor ->
        println("Valor modo 3 = $valor")
    }

    println("\nTambém pode pegar pelos índices do array.")
    for(indice in values.indices){
        println("Valor modo 4 = ${values[indice]}")
    }

    println("\nTambém pode organizar o array.")
    values.sort()
    for(valor in values){
        println("Valor modo 5 = $valor")
    }
}