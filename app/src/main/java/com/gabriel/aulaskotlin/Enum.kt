package com.gabriel.aulaskotlin

enum class StatusPedido {
    AGUARDADNDO_APROVACAO, //0
    PEDIDO_REALIZADO, //1
    PAGAMENTO_CONFIRMADO,//2
    PEDIDO_ENVIADO, //3
    PEDIDO_ENTREGUE //4
}

class Pedido(
    var total: Double = 0.0,
    var itens: String = "",
    var statusPedido: StatusPedido = StatusPedido.AGUARDADNDO_APROVACAO
) {

}
fun main() {

    //Tela Compras
    val pedido = Pedido(100.50, "HeadSet, Pendrive")

    //Status pedido
    println("Status do Pedido: ${StatusPedido.AGUARDADNDO_APROVACAO.ordinal}")

    //Pagamento com cartão
    pedido.statusPedido = StatusPedido.PEDIDO_REALIZADO

    //Transportadora
    pedido.statusPedido = StatusPedido.PEDIDO_ENVIADO

    //Historico de compras
    if (pedido.statusPedido == StatusPedido.PEDIDO_REALIZADO) {
        println("O seu pedido foi realizado")
    } else if (pedido.statusPedido == StatusPedido.PEDIDO_ENVIADO) {
        println("Seu pedido foi enviado")
    } else if (pedido.statusPedido == StatusPedido.PAGAMENTO_CONFIRMADO) {
        println("Seu pagamento foi confirmado")
    }
}