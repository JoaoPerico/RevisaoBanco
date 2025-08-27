package org.example.classes

import org.example.enumeradores.Habilidades
import org.example.enumeradores.Setor
import org.example.enumeradores.Sexo
import java.math.BigDecimal

class Funcionario(


    cpf : Long,
    nome: String,
    idade: Int,
    sexo: Sexo,
    val funcao: String,
    val salario: BigDecimal,
    val experiencia: Int,
    val habilidade: Habilidades,
    val setor : Setor

) : Pessoa(
    nome = nome,
    idade = idade,
    cpf = cpf,
    sexo = sexo
)
{
    //comportamentos do profissional
    fun instalarCaixaDAgua (clt : Funcionario){
        if(clt.setor.equals(Setor.MONTAGEM)){
            println("Profissional habilitado")
        }else{
            println("Profissional desqualificado")
        }
    }

    override fun receberConta (conta: Conta, aDebitar : BigDecimal){
        conta.saldo = conta.saldo.subtract(aDebitar)
    }
}