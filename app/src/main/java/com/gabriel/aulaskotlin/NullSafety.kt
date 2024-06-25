package com.gabriel.aulaskotlin


class Carro{

    var cor = "vermelho"
//    metodo
    fun acelerar(){
//        ****
    }


}
fun main() {

//    podemos receber a instancia ou um valor nulo
    var carro: Carro? = null
//    Instancia
    carro = Carro()

    //Elvis operator
    val cor = carro?.cor ?: "cor padrão"
    println(cor)

    //chamada segura
    //println( carro?.cor )
}

