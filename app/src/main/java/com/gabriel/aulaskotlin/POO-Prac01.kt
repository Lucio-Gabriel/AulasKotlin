package com.gabriel.aulaskotlin


class Veiculo{

    var Marca = ""
    var Modelo = ""
    var ano = Int

    fun veiculoLigado(){
        println("O veiculo foi ligado")
    }

    fun veiculoAndando(){
        println("O veiculo está em movimento")
    }

}

fun main() {

    var veiculo = Veiculo()
    veiculo.Modelo = "carro";
    veiculo.veiculoAndando()
    veiculo.veiculoLigado()

}