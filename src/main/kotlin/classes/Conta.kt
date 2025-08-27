package org.example.classes

import java.math.BigDecimal

class Conta(
    val numeroConta: Long,
    val senha: String,
    var saldo: BigDecimal,
    val agencia: Int,
    val limite: BigDecimal,

    )