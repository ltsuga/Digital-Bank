package com.digitalbank.aula.test

import com.digitalbank.aula.Banco

fun main(){
    val digitalBank = Banco(nome= "Digital", numero = 12)

    println(digitalBank.info())

}