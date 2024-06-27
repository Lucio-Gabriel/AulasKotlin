package com.gabriel.aulaskotlin

class Usuario {

//    propriedades
//    assinatura nome + parametros e seus tipos
    fun logar(email: String, senha: String) {
        println("Usuario logado com o E-mail: $email, E com a senha: $senha")
    }

    fun logar(token: Int) {

        println("Seu acesso foi com o TOKEN: $token")
    }

    fun logar(numeroCelular: String){

        println("Seu acesso foi com esse número de celular $numeroCelular")

    }

}

fun main() {

    val usuario = Usuario()
    usuario.logar("98989899")

}