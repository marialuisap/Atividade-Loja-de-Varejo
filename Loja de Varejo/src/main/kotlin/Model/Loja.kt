package Model

open class Loja {
    var nome:String
    var endereco:String
    var telefoneComercial:String

    var vendedor:Vendedor
    var cliente:Cliente
    var venda:Venda
    var produto:Produto
    var fornecedora:Fornecedora
    var transportadora:Transportadora

    constructor (
        nome: String,
        endereco: String,
        telefoneComercial: String,
        vendedor: Vendedor,
        cliente: Cliente,
        venda: Venda,
        produto: Produto,
        fornecedora: Fornecedora,
        transportadora: Transportadora
            ) {
        this.nome = nome
        this.endereco = endereco
        this.telefoneComercial = telefoneComercial
        this.vendedor = vendedor
        this.cliente = cliente
        this.venda = venda
        this.produto = produto
        this.fornecedora = fornecedora
        this.transportadora = transportadora
    }

}