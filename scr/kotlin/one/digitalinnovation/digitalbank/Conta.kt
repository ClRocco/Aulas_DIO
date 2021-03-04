package one.digitalinnovation.digitalbank

import java.math.BigDecimal

class Conta(                    // () define construtor primário.
        val agencia: String,
        val numero: String,
        val saldo: BigDecimal
){
    fun Deposito(valor: BigDecimal){

    }

    fun Saque(valor: BigDecimal){

    }
}