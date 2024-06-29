package com.gabriel.aulaskotlin

//Sempre colocar OPEN para deixar a classe herda
open class Animal{ //classe pai, super class
    var cor = ""
    var tamanho = "" //pequeno, médio e grande porte
    var peso = 0.0

    open fun correr(){ // Método
        println("Correr como um")
    }
    fun dormir(){ // Método
        println("Dormi")
    }
}

class Cao : Animal() {//Subclasse classe filha
    fun latir() = println("Latir") //Metodo inline block
    //SobreEscrita de metodo - sobreposição
    override fun correr() {
        super.correr() //Acessando a implementação
        println("cão com 4 patas")
    }
}

class Passaro : Animal(){
    fun voar() = println("Voar")//Metodo inline block

    override fun correr() {
        super.correr()
        println("passaro com 2 patas")
    }
}

fun main() {

    val cao = Cao()
    cao.correr()


    val passaro = Passaro()
    passaro.correr()

}