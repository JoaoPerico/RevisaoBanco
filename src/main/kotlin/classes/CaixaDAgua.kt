package org.example.classes

import org.example.enumeradores.Material
import java.math.BigDecimal

class CaixaDAgua(// construtor da classe esses dois parenteses
    val material: Material,
    val capacidade : Int,
    val cor : String,
    val peso : Double,
    val preco : BigDecimal,
    val altura : Double,
    val profundidade : Double,
    val largura : Double,
    )
