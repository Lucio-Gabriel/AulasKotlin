package com.gabriel.aulaskotlin

class Medicos {

    var nome = ""
    var ID = Int
    var especialidade = ""


    fun login(nome: String, ID: Int) {
        println("Bem vindo ao seu acesso Dr: $nome - ID de acesso: $ID")
    }

    init {
        println("Bem Vindo ao Sistema Medico-Center")
    }

}

fun main() {

    val medico = Medicos()
    medico.login("Bernado Silva", 9191)

}