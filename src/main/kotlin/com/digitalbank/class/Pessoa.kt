package com.digitalbank.`class`

class Pessoa { //outer class
    var nome: String = "Leo"
    var cpf: String = "123.234.568-11"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
}

fun main(){
    val leo = Pessoa()

    println(leo.pessoaInfo())


}