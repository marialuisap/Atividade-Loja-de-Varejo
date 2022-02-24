package Model

open class Venda {
    var quantidade: String? = null
    var valor: Double? = null
    var metodoDePagamento: String? = null
    var dataDaVenda: Short? = null
    var cliente: Cliente
    var vendedor: Vendedor
    var produto: Produto

    // venda, quantidade, metodoDePagamento, dataDaVenda, cliente, vendedor, produto
}