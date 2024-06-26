package com.gabriel.aulaskotlin


//funcoes com parametros
fun somar( numero1: Int, numero2: Int, numero3: Int = 0){
    println( numero1 + numero2 + numero3)
}

fun main() {

    somar(10,10, numero3 = 10)

}