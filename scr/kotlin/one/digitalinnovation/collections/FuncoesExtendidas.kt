package one.digitalinnovation.collections

import java.math.BigDecimal
// Cria um afunção extendida de uma função existente, no caso Array() //
fun Array<BigDecimal>.somatoria() = this.reduce{
    acc, valor -> acc + valor // Adiciona cada valor do array ao acumulador acc e retorna acc
}

fun Array<BigDecimal>.media() =
    if(this.isEmpty()) BigDecimal.ZERO
    else this.somatoria() / this.size.toBigDecimal()
