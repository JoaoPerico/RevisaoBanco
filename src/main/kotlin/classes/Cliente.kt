package org.example.classes

import org.example.enumeradores.Sexo

class Cliente(
    nome: String,
    val sobrenome: String,
    idade: Int,
    cpf: Long,
    sexo: Sexo,
    val endereco: String,
    val telefone: String,
    val matricula: Int,

    ) : Pessoa(
    nome = nome,
    idade = idade,
    cpf = cpf,
    sexo = sexo
)