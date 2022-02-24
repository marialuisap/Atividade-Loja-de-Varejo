package Controller

import Model.Loja
import Model.Produto
import Model.Fornecedora
import Model.Transportadora
import Model.Venda
import Model.Vendedor
import Model.Cliente
import Model.Loja

class Loja {
    fun lojaFactory (
        nome: String,
        endereco: String,
        telefoneComercial: String,
        vendedor: Vendedor,
        cliente: Cliente,
        venda: Venda,
        produto: Produto,
        fornecedora: Fornecedora,
        transportadora: Transportadora
    ) = Model.Loja (
        this.nome = nome
        this.endereco = endereco
        this.telefoneComercial = telefoneComercial
        this.vendedor = vendedor
        this.cliente = cliente
        this.produto = produto
        this.venda = venda
        this.fornecedora = fornecedora
        this.transportadora = transportadora
    )
}