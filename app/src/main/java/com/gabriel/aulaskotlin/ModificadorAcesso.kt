package com.gabriel.aulaskotlin

open class Car{

//    var modelo = ""


    protected open fun injecaodecombustivel(){
        println("Adicionando Injeção")
    }
    fun acelerar(){
        injecaodecombustivel()
        println("O carro está acelerando")
    }

}

class Gol : Car(){
//    sobrescrevendo o metodo
    override fun injecaodecombustivel() {
        super.injecaodecombustivel()
    }

}

fun main() {

    var carro = Car()
    carro.acelerar()

}