package com.gabriel.aulaskotlin

fun main() {

    /*val nomes = arrayOf(
        "Jamilton", "Ana", "Marcos"
    )

    nomes[0] = "Gabriel"

    println( nomes[0] )*/

//    estrutura de loops while

    /*var numero = 1
    while ( numero <= 5 ){
        println("executou $numero")
        numero++;
    }*/

    //    estrutura de loops for

    /* for (numeros in 1..10){
         println("executou $numeros")
     }*/

//    for com arrays

    val postagens = arrayOf(
        "Bom dia", "Boa tarde", "Boa noite"
    )

//    retorno normal
    /*for (postagem in postagens) {
        println("mensagem: $postagem")
    }*/

//    for com retorno de indice
    for ((indice, postagem) in postagens.withIndex()) {
        println("$indice: $postagem")
    }

}