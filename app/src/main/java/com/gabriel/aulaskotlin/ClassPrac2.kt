package com.gabriel.aulaskotlin

class Pacientes {

    var nome = ""
    var CPF = Int
    var tipoAtendimento = ""

    init {
        println("Bem vindo ao nosso Consultorio: $nome ")
    }

    fun cadastroPaciente(nome: String, CPF: Int) {
        println("Olá: $nome é um prazer ter você aqui, esse é seu CPF: $CPF, por favor escolha seu atendimento de preferencia")
    }

    fun consultasDisponiveis() {
        val selecionaEspecialidade = 1
        when (selecionaEspecialidade) {

            1 -> println("Pediatria.")
            2 -> println("Cirurgia Geral.")
            3 -> println("Ginecologia e Obstetrícia.")
            4 -> println("Anestesiologia.")
            5 -> println("Cardiologia")
            else -> println("Nenhuma Opção Acima Selecionada, Favor Selecione Alguma")
        }
    }
}
fun main() {
    val paciente = Pacientes()
    paciente.cadastroPaciente("Lucio Mauro", 1232)
    paciente.consultasDisponiveis()
}