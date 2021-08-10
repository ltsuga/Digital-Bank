package com.digitalbank.aula

class Cliente(
    nome: String,
    val clienteTipo: ClienteTipo,
    cpf: String,
    val senha: String
) : Pessoa(nome, cpf), Logavel {
    override fun login(): Boolean = "123456" == senha
    override  fun toString(): String = """
    Nome: $nome
    CPF: $cpf
    Tipo: ${clienteTipo.descricao}
    """.trimIndent()
    }
