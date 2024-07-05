package com.gabriel.aulaskotlin

class Cinema (
    var filme : String  = "",
    var secao : Int
){
    companion object{
        const val IDADE_PERMITIDA = "Livre"
        fun exibirNotifiicacao(){
            println("A Classificação é $IDADE_PERMITIDA")
        }

    }
    fun cinemaSecao(){
        println("Bem vindo ao cinecom o filme escolhido é $filme e a seção é $secao")
    }
}
fun main() {

    Cinema.exibirNotifiicacao()
    val cliente = Cinema("Divertidamente", 23)
    cliente.cinemaSecao()

}