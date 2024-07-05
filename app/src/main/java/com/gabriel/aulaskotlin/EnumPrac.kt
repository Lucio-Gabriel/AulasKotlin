package com.gabriel.aulaskotlin

enum class StatusConsulta {
    CADASTRANDO_PACIENTE,
    PACIENTE_CADASTRADO,
    PACIENTE_AGENDADO,
    PACIENTE_CONSULTADO
}

class AgendasConsultas(

    var nomePaciente: String = "",
    var tipoConsulta: String = "",
    var statusConsulta: StatusConsulta = StatusConsulta.CADASTRANDO_PACIENTE

//    val dataNascimento : Double

) {
    init {
        println("Bem vindo ao consultorio Melhor Vida")
    }

    companion object {
        const val OBSERVACAO = "Todos os pacientes precisam ter cadastro no sistema"
        fun exibirNotificacao() {
            println("Observação $OBSERVACAO")
        }
    }
}


fun main() {

    var paciente = AgendasConsultas("Lucio", "Alergista", StatusConsulta.PACIENTE_AGENDADO)

    AgendasConsultas.exibirNotificacao()

    //Status Atual
    //println("Status do paciente no sistema: ${StatusConsulta.PACIENTE_CADASTRADO}")

    //Cadastro Paciente
    paciente.statusConsulta = StatusConsulta.CADASTRANDO_PACIENTE

    //Apos cadastro
    paciente.statusConsulta = StatusConsulta.PACIENTE_CADASTRADO

    //Paciente Agendado
    paciente.statusConsulta = StatusConsulta.PACIENTE_AGENDADO

    //Paciente Consultando
    paciente.statusConsulta = StatusConsulta.PACIENTE_CONSULTADO


    //Historico dentro de cadastro
    if (paciente.statusConsulta == StatusConsulta.PACIENTE_CADASTRADO) {
        println("Estamos realizando o seu cadastro!")
    } else if (paciente.statusConsulta == StatusConsulta.PACIENTE_CADASTRADO) {
        println("Párabens você foi cadastado no nosso sistema!")
    } else if (paciente.statusConsulta == StatusConsulta.PACIENTE_AGENDADO) {
        println("Sua consulta foi agendada!")
    } else if (paciente.statusConsulta == StatusConsulta.PACIENTE_CONSULTADO) {
        println("Paciente: ${paciente.nomePaciente} está se consultando!")
    }


}