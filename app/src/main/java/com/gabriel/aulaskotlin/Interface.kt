package com.gabriel.aulaskotlin

interface Presidenciavel{
    fun canditado()
}

abstract class Pessoa{
    fun comer () = println("Estou comendo")
}

class DesenvolvedorAndroid : Pessoa(), Presidenciavel {
    fun programar() = println("Programando")
    override fun canditado() {
        println("Um Programador quer ser presidente...")
    }
}
class DesenvolvedorWeb : Pessoa() {
    fun programar() = println("Programando")

}
class Jornalista : Pessoa(), Presidenciavel{
    fun escrevendoNoticia() = println("Escrevendo Noticias")
    override fun canditado() {
        println("Fazer o processo para se canditadar")
    }
}
class Servidor : Pessoa() {}

fun main() {

    val desenvolvedorAndroid = DesenvolvedorAndroid()
    desenvolvedorAndroid.programar()
    desenvolvedorAndroid.comer()
    desenvolvedorAndroid.canditado()

    println("-----------------------------------")

    val jornalista = Jornalista()
    jornalista.comer()
    jornalista.escrevendoNoticia()
    jornalista.canditado()

}