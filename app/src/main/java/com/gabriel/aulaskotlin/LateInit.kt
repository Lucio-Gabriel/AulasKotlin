package com.gabriel.aulaskotlin

import android.icu.text.PluralRules

// 1) valor 2) null 3) LATEINIT
class Produto {
    lateinit var descricao : String
}

fun main() {

    val produto = Produto()
    produto.descricao = "Notebook"
    println(produto.descricao)

}