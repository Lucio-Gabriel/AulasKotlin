package com.gabriel.aulaskotlin

class Carro1(
    var modelo: String = "",
    var velociade: Int = 0
) {
    companion object {
        const val VELOCIDADE_MAX_PERMITIDA = 120
        fun exibirMensagemVelocidadeMaxima() {
            println("A velocidade máxima permitida é: $VELOCIDADE_MAX_PERMITIDA")
        }
    }

    fun exibirInformacoes() {
        println("Informações esse carro é do modelo: $modelo e está na velocidade $velociade")
    }
}

fun main() {
    Carro1.exibirMensagemVelocidadeMaxima()
    //  criando uma estancia ou objeto
    var fusca = Carro1("Fusca", 70)
    fusca.exibirInformacoes()
}