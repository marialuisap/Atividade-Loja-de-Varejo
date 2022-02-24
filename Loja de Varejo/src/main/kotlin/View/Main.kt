package view

import model.Loja

fun main(args: Array<String>) {
    val lojaController = controller.Loja()
    val loja = lojaController.lojaFactory(
        nome = "Gamestop",
        endereco = "Rua Desconhecida",
        vendedor = "Fulano",
        telefone = "985418664",
        produto = "Controle",
        fornecedora = "Sony, Microsoft",
        transportadora = "Correios",
    )
    println(loja)
}

// vendedor, nome, endereco, telefoneComercial, produto
// cliente, nome, cpf, endereco,
// produto, quantidade, valor, validade, fornecedor,
// fornecedor, nome, endereco, telefoneComercial, produto,
// venda, quantidade, metodoDePagamento, dataDaVenda, cliente, vendedor, produto
// transportadora, nome, endereco, telefoneComercial, tempoDeEntrega, produto, fornecedor,