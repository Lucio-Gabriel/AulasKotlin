package com.gabriel.aulaskotlin


//Sempre colocar OPEN para deixar a classe herda
//classe animal abstrada nao pode ser instanciada
abstract class Animal2{ //classe pai, super class, class abstrata
    var cor = ""
    var tamanho = "" //pequeno, médio e grande porte
    var peso = 0.0

    open fun correr(){ // Método
        println("Correr como um")
    }
    abstract fun dormir()

}

class Cao2 : Animal2() {//Subclasse classe filha, concreta
fun latir() = println("Latir") //Metodo inline block
    //SobreEscrita de metodo - sobreposição
    override fun correr() {
        super.correr() //Acessando a implementação
        println("cão com 4 patas")
    }

    override fun dormir() {
        println("Dormi como um cão")
    }
}

class Passaro2 : Animal(){
    fun voar() = println("Voar")//Metodo inline block

    override fun correr() {
        super.correr()
        println("passaro com 2 patas")
    }

    override fun dormir() {
        println("Dormir como um passaroo")
    }


}

fun main() {

    val cao = Cao2()
    cao.correr()
    cao.dormir()

    val passaro = Passaro2()
    passaro.correr()
    passaro.dormir()

}