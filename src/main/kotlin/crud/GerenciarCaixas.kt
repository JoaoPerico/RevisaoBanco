package org.example.crud

import org.example.classes.CaixaDAgua
import org.example.enumeradores.Material

fun cadastrarCaixa(){
/*
    val material: Material,
    val capacidade : Int,
    val cor : String,
    val peso : Double,
    val preco : BigDecimal,
    val altura : Double,
    val profundidade : Double,
    val largura : Double,
    )
    PLASTICO, PVC, METAL, ARGAMASSA
*/
    println("Escolha o material do qual a caixa é composta")
    println("1 - Plastico")
    println("2 - PVC")
    println("3 - Metal")
    println("4 - Argamassa")
    val opcao = readln().toInt()
    var material : Material
    when(opcao){
        1 -> material = Material.PLASTICO
        2 -> material = Material.PVC
        3 -> material = Material.METAL
        4 -> material = Material.ARGAMASSA
        else -> material = Material.PLASTICO
    }

    println("Capacidade da caixa em litros")
    val capacidade = readln().toInt()

    println("Qual a cor da caixa?")
    val cor = readln()

    println("Qual o peso da caixa")
    val peso = readln().toDouble()

    println("Qual o preço da caixa")
    val preco = readln().toBigDecimal()

    println("Qual a altura da caixa")
    val altura = readln().toDouble()

    println("Qual a profundidade da caixa")
    val profundodade = readln().toDouble()

    println("Qual a largura da caixa")
    val largura = readln().toDouble()

    //salvar as variaveis agora dentro da classe
    CaixaDAgua(
        material = material,
        capacidade = capacidade,
        cor = cor,
        peso = peso,
        preco = preco,
        altura = altura,
        profundidade = profundodade,
        largura = largura
    )
}

fun editarCaixa(){

}
fun listarCaixas(){

}
fun excluirCaixa(){

}