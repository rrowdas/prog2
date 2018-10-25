package Vendas;

import Produtos.Produtos;

public abstract class Vendas { // Estoque

    protected String dataVenda;
    protected String cpfVendedor;
    protected String formaPagamento;
    protected String cpfCliente;
    protected Produtos[] carrinhoCompras = new Produtos[20];
    protected double valorTotalDoCarrinho = 0;

    public Vendas(String dataVenda, String cpfVendedor, String formaPagamento, String cpfCliente) {

        this.dataVenda = dataVenda;
        this.cpfVendedor = cpfVendedor;
        this.formaPagamento = formaPagamento;
        this.cpfCliente = cpfCliente;
    }

    public Produtos[] getCarrinhoCompras() {
        return carrinhoCompras;
    }

    public void setCarrinhoCompras(Produtos[] carrinhoCompras) {
        this.carrinhoCompras = carrinhoCompras;
    }

    public String getCpfCliente() {
        return this.cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getDataVenda() {
        return this.dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getCpfVendedor() {
        return this.cpfVendedor;
    }

    public void setCpfVendedor(String novoCpf) {
        this.cpfVendedor = novoCpf;
    }

    public String getFormaPagamento() {
        return this.formaPagamento;
    }

    public void setFormaPagamento(String novaFormaPagamento) {
        this.formaPagamento = novaFormaPagamento;
    }

    public double getValorTotalDoCarrinho() {
        return valorTotalDoCarrinho;
    }

    public void setValorTotalDoCarrinho(double valorTotalDoCarrinho) {
        this.valorTotalDoCarrinho = valorTotalDoCarrinho;
    }

//    public int getTamanhoDoCarrinho() {
//        return tamanhoDoCarrinho;
//    }
//
//    public void setTamanhoDoCarrinho(int tamanhoDoCarrinho) {
//        this.tamanhoDoCarrinho = tamanhoDoCarrinho;
//    }
    public void adicionaProdutoCarrinho(Produtos novoProduto) {
        boolean carrinhoCheio = false;
        boolean produtoAdd = false;
        
        for (int i = 0; i < carrinhoCompras.length && !carrinhoCheio && !produtoAdd; i++) {
            System.out.println("ahhahahahahhahahahhha");
            if (carrinhoCompras[19] != null) {
                System.out.println("Abra uma nova venda,o carrinho está cheio");
                carrinhoCheio = true;
            }
            else {
                carrinhoCompras[i] = novoProduto;
                valorTotalDoCarrinho += novoProduto.getPrecoFinal(); //Adiciona no carrinho o valor do produto
                produtoAdd = true;
            }
        }
    }

    public double valorParcelas() {
        return valorTotalDoCarrinho;
    }

}