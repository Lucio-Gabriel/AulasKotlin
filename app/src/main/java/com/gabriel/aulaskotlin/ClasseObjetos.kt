package com.gabriel.aulaskotlin

//Abstracao

class Jogador{

    var kart = ""
    var pneu =  ""
    var planador  = ""

    fun acelerar( aceleracao:Int = 0 ){ // quando colocamos 0 não precisamos colocar valor obrigatorio
        println("acelerar na velocidade : $aceleracao")
    }

   /* fun retornaPoder(): String {
        return "Casco vermelho"
    }*/

    fun retornaPoder():String = "Casco Vermelho"

}

fun main() {

//    para estanciar em kotllin precisando de variavel

    val jogador = Jogador()
    jogador.kart = "KartAzul"
    jogador.pneu = "pneu preto"
    jogador.planador = "verde"
//    println(jogador.acelerar())
    val poder= jogador.retornaPoder()
    println( poder )

}