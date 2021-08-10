package com.digitalbank.aula.test

import com.digitalbank.aula.Analista
import com.digitalbank.aula.Funcionario
import com.digitalbank.aula.Pessoa
import java.math.BigDecimal

fun main(){
    val eu = Analista(nome = "nome eu", cpf = "1234", salario= 2000.0)
    println(eu.nome)
    println(eu.cpf)
    println(eu.salario)

    ImprimeRelatorioFuncionario.imprime(eu)
}



