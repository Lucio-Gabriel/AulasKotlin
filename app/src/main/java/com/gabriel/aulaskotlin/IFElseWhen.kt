package com.gabriel.aulaskotlin

fun main() {

    /*val opcao = 5

    if ( opcao == 1 ){
        println("Cartão de Credito")
    } else if ( opcao == 2 ){
        println("Saldo")
    }else if ( opcao == 3 ){
        println("Extrato")
    }
    else{
    println("Nenhuma opcao selecionada, favor selecione novamente")
    }*/

    /*val opcao = 8

    if ( opcao in 1..3 ){
        println("opcoes selecionadas: 1, 2, 3")
    }else if( opcao in 4..8){
        println("opcoes selecionadas: 4 até 8")
    }*/

    val opcao = 5
//    println("Cartão de Credito")
//    println("Saldo")
//    println("Extrato")
//    println("Nenhuma opcao selecionada, favor selecione novamente")
    when (opcao) {
        1 -> println("Cartão de Credito")
        2 -> println("Saldo")
        3 -> println("Extrato")
        else -> println("Nenhuma opcao selecionada, favor selecione novamente")

    }


}