package com.digitalbank.aula.test

import com.digitalbank.aula.Cliente
import com.digitalbank.aula.ClienteTipo

fun main(){
    val jose = Cliente(
        nome = "jose silva",
        cpf = "789456-45",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )
    println(jose)

    TesteAutenticacao().autenticacao(jose)
}
